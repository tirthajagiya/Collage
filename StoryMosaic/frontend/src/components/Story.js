import { useEffect, useState } from "react";
import "./Story.css";

export default function Story() {
  const [data, setData] = useState([]);
  const apiUrl = "http://localhost:3000/story";
  useEffect(() => {
    fetch(apiUrl, { method: "GET" })
      .then((res) => res.json())
      .then((res) => setData(res));
  }, []);

  const formated_story = data.map((story) => {
    return (
      <div className="story-card">
        <div className="story-cover">{story.title}</div>
        <div className="story-info">
          <h3 className="story-title">{story.title}</h3>
          <div className="story-author">
            <div className="author-avatar">NH</div>
            <span>{(story.contributor)}</span>
          </div>
          <p>{story.title}</p>
        </div>
      </div>
    );
  });
  return (
    <>
      <div className="search-container">
        <input
          type="text"
          className="search-bar"
          placeholder="Search for stories, authors, or genres..."
        />
        <div className="filters">
          <button className="filter-btn active">All</button>
          <button className="filter-btn">Fiction</button>
          <button className="filter-btn">Non-Fiction</button>
          <button className="filter-btn">Business</button>
          <button className="filter-btn">Self-Help</button>
        </div>
      </div>

      <main className="library-container">
        <section>
          <h2 className="category-title">Popular Now</h2>
          <div className="story-grid">{formated_story}</div>
        </section>
      </main>
    </>
  );
}
