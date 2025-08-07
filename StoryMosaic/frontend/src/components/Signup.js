import { useState } from "react";
import { Link, Navigate, useNavigate } from "react-router-dom";

export default function Signup() {
  const [data, setData] = useState({});
  return (
    <>
      <div className="auth-container">
        <div className="auth-header">
          <div className="logo-text">StoryMosaic</div>
          <p>Join Our Creative Community</p>
        </div>

        <form className="auth-form" action="/signup" method="POST">
          <div className="form-group">
            <label className="form-label">Username</label>
            <input
              type="text"
              className="form-input"
              name="username"
              placeholder="Choose a username"
              required
              onChange={(e) => {
                setData({ ...data, username: e.target.value });
              }}
            />
          </div>

          <div className="form-group">
            <label className="form-label">Email</label>
            <input
              type="email"
              className="form-input"
              name="email"
              placeholder="Enter your email"
              required
              onChange={(e) => {
                setData({ ...data, email: e.target.value });
              }}
            />
          </div>

          <div className="form-group">
            <label className="form-label">Phone Number</label>
            <input
              type="tel"
              className="form-input"
              name="phone"
              placeholder="Enter your phone number"
              required
              onChange={(e) => {
                setData({ ...data, number: e.target.value });
              }}
            />
          </div>

          <div className="form-group">
            <label className="form-label">Password</label>
            <div className="password-input-container">
              <input
                type="password"
                className="form-input"
                name="password"
                placeholder="Create a password"
                required
                onChange={(e) => {
                  setData({ ...data, password: e.target.value });
                }}
              />
            </div>
          </div>

          <div className="file-input-container">
            <label className="form-label">Profile Image</label>
            <label className="file-input-label">
              <input
                type="file"
                className="file-input"
                name="profile_image"
                accept="image/*"
                onChange={(e) => {
                  setData({ ...data, image: e.target.value });
                }}
              />
            </label>
          </div>

          <button
            type="submit"
            className="submit-btn"
            onClick={() => {
              const apiUrl = "http://localhost:3000/signup";
              fetch(apiUrl, {
                method: "POST",
                body: JSON.stringify(data),
                headers: {
                  "Content-Type": "application/json",
                },
              })
                .then((res) => res.json())
                .then((res) => console.log("Post Data")
                
            );
            }}
          >
            Create Account
          </button>

          <div className="auth-footer">
            <p>
              Already have an account? <Link to="/login">Login here</Link>
            </p>
          </div>
        </form>
      </div>
    </>
  );
}
