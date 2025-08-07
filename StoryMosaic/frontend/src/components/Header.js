import { Link } from "react-router-dom";
import "./Header.css";
export default function Header() {
  return (
    <>
      <header className="header">
        <div className="header-container">
          <div className="logo">
            <img src="book1.png" width="25" height="25" />
            <div className="logo-text">StoryMosaic</div>
          </div>
          <div className="user-controls">
            <Link to="/login" className="nav-link">
              Login
            </Link>
            <div className="user-avatar">👤</div>
          </div>
        </div>
      </header>

      <nav className="main-menu">
        <div className="menu-container">
          <div className="nav-menu">
            <Link to="/" className="nav-link">
              Home
            </Link>
            <Link to="/story" className="nav-link">
              Explore Stories
            </Link>
            {/* <a href="#" className="nav-link">
              Collaborations
            </a>
            <a href="#" className="nav-link">
              Community
            </a>
            <a href="#" className="nav-link">
              Support
            </a> */}
          </div>
          <div className="user-controls">
            {/* <a href="#" className="create-btn">
              <Link to="/write-story">Create Story</Link>
            </a> */}
          </div>
          <button className="mobile-menu-btn">☰</button>
        </div>
      </nav>
    </>
  );
}
