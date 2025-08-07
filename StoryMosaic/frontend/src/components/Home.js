import { Link } from "react-router-dom";
import "./Home.css";
import { useEffect, useState } from "react";
export default function Home() {
  const [data, setData] = useState([]);
  const apiUrl = "http://localhost:3000/story";
  useEffect(() => {
    fetch(apiUrl, { method: "GET" })
      .then((res) => res.json())
      .then((res) => setData(res));
  }, []);

  const formated_story = data.map((story) => {
    return (
      <div key={story._id} className="story-card">
        <h3 className="story-title">{story.title}</h3>
        <span className="story-excerpt">{story.content.substring(0,40)} </span>
        <Link to={"story/"+story._id} className="more-link">
            more
        </Link>
      </div>
    );
  });

  return (
    <>
      <section className="hero-section">
        <div className="hero-content">
          <h1 className="hero-title">Welcome to StoryMosaic</h1>
          <p className="hero-subtitle">Discover, Read, and Share Amazing Stories</p>
          <Link to="/story" className="read-more">
            Start Reading
          </Link>
          <Link to="/write-story" className="read-more">
            Start Writing
          </Link>
        </div>
      </section>

      <section className="featured-stories">
        <div className="stories-grid">{formated_story}</div>
      </section>

      <section className="features-section">
        <div className="features-grid">
          <div className="feature-card">
            <div className="feature-icon">📚</div>
            <h3>Vast Library</h3>
            <p>Access thousands of stories across various genres</p>
          </div>
          <div className="feature-card">
            <div className="feature-icon">💫</div>
            <h3>Personalized Experience</h3>
            <p>Get recommendations based on your reading preferences</p>
          </div>
          <div className="feature-card">
            <div className="feature-icon">🤝</div>
            <h3>Community</h3>
            <p>Connect with fellow readers and share your thoughts</p>
          </div>
        </div>
      </section>
    </>
  );
}
