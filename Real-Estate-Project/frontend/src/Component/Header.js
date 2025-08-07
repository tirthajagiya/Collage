import { Link } from "react-router-dom";
import "./Header.css";
export default function Header() {
  return (
    <>
      <header class="header">
        <div class="header-container">
          <div class="logo">
            <svg width="50" height="50" viewBox="0 0 24 24" fill="#4299e1">
              <path d="M12 2L2 7l10 5 10-5-10-5z" />
              <path d="M2 17l10 5 10-5M2 12l10 5 10-5" />
            </svg>
            Your Real Estate Co.
          </div>

          <nav class="nav-menu">
            <Link to={"/"}>Home</Link>&nbsp;
            <Link to={"/exploreproperty"}>Explore Property</Link>&nbsp;
            <Link to={"/findbroker"}>Find Broker</Link>&nbsp;
            <Link to={"/customercare"}>Customer Care</Link>&nbsp;
            <Link to={"/login"}>Login</Link>
          </nav>
        </div>
      </header>
    </>
  );
}
