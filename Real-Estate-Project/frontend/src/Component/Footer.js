import './Footer.css'
export default function Footer(){
    return(
        <>
            <footer class="footer">
        <div class="footer-container">
            <div class="footer-section company-info">
                <h3 class="footer-title">Your Real Estate Co.</h3>
                <p>Helping you find your dream home with personalized service and local expertise.</p>
                <div class="social-links">
                    <a href="#" aria-label="Facebook">
                        <svg fill="currentColor" viewBox="0 0 24 24">
                            <path d="M12 2C6.477 2 2 6.477 2 12c0 4.991 3.657 9.128 8.438 9.879V14.89h-2.54V12h2.54V9.797c0-2.506 1.492-3.89 3.777-3.89 1.094 0 2.238.195 2.238.195v2.46h-1.26c-1.243 0-1.63.771-1.63 1.562V12h2.773l-.443 2.89h-2.33v6.989C18.343 21.129 22 16.99 22 12c0-5.523-4.477-10-10-10z"/>
                        </svg>
                    </a>
                    <a href="#" aria-label="Instagram">
                        <svg fill="currentColor" viewBox="0 0 24 24">
                            <path d="M12 2c-2.714 0-3.055.012-4.121.06-1.066.048-1.793.218-2.43.465a4.901 4.901 0 0 0-1.772 1.153 4.902 4.902 0 0 0-1.153 1.772c-.247.637-.417 1.364-.465 2.43C2.012 8.945 2 9.286 2 12s.012 3.055.06 4.121c.048 1.066.218 1.793.465 2.43a4.903 4.903 0 0 0 1.153 1.772 4.902 4.902 0 0 0 1.772 1.153c.637.247 1.364.417 2.43.465 1.066.048 1.407.06 4.121.06s3.055-.012 4.121-.06c1.066-.048 1.793-.218 2.43-.465a4.902 4.902 0 0 0 1.772-1.153 4.901 4.901 0 0 0 1.153-1.772c.247-.637.417-1.364.465-2.43.048-1.066.06-1.407.06-4.121s-.012-3.055-.06-4.121c-.048-1.066-.218-1.793-.465-2.43a4.902 4.902 0 0 0-1.153-1.772 4.901 4.901 0 0 0-1.772-1.153c-.637-.247-1.364-.417-2.43-.465C15.055 2.012 14.714 2 12 2zm0 1.8c2.667 0 2.987.01 4.04.058.976.045 1.504.207 1.858.344.467.182.8.399 1.15.748.349.35.566.683.748 1.15.137.354.3.882.344 1.858.048 1.053.058 1.373.058 4.04s-.01 2.987-.058 4.04c-.045.976-.207 1.504-.344 1.858-.182.467-.399.8-.748 1.15-.35.349-.683.566-1.15.748-.354.137-.882.3-1.858.344-1.053.048-1.373.058-4.04.058s-2.987-.01-4.04-.058c-.976-.045-1.504-.207-1.858-.344a3.106 3.106 0 0 1-1.15-.748 3.107 3.107 0 0 1-.748-1.15c-.137-.354-.3-.882-.344-1.858-.048-1.053-.058-1.373-.058-4.04s.01-2.987.058-4.04c.045-.976.207-1.504.344-1.858.182-.467.399-.8.748-1.15a3.106 3.106 0 0 1 1.15-.748c.354-.137.882-.3 1.858-.344 1.053-.048 1.373-.058 4.04-.058zm0 3.065a5.135 5.135 0 1 0 0 10.27 5.135 5.135 0 0 0 0-10.27zm0 8.47a3.335 3.335 0 1 1 0-6.67 3.335 3.335 0 0 1 0 6.67zm6.538-8.67a1.2 1.2 0 1 0-2.4 0 1.2 1.2 0 0 0 2.4 0z"/>
                        </svg>
                    </a>
                    <a href="#" aria-label="LinkedIn">
                        <svg fill="currentColor" viewBox="0 0 24 24">
                            <path d="M19 3a2 2 0 0 1 2 2v14a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h14zm-3 7.5a3 3 0 0 0-3 3V19h-3v-5.5a1.5 1.5 0 0 1 1.5-1.5h1a1.5 1.5 0 0 1 1.5 1.5V19h3v-5.5a4.5 4.5 0 0 0-4.5-4.5 3 3 0 0 0-3 3zM7 8.5a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3zM6 19h3V9H6v10z"/>
                        </svg>
                    </a>
                    <a href="#" aria-label="Twitter">
                        <svg fill="currentColor" viewBox="0 0 24 24">
                            <path d="M22 4.599a8.59 8.59 0 0 1-2.472.678 4.305 4.305 0 0 0 1.887-2.383 8.627 8.627 0 0 1-2.728 1.041 4.3 4.3 0 0 0-7.313 3.917 12.211 12.211 0 0 1-8.862-4.483 4.3 4.3 0 0 0 1.331 5.743 4.277 4.277 0 0 1-1.948-.538v.054a4.299 4.299 0 0 0 3.45 4.215 4.3 4.3 0 0 1-1.133.151 4.276 4.276 0 0 1-.81-.077 4.303 4.303 0 0 0 4.016 2.982A8.618 8.618 0 0 1 2 19.54a12.18 12.18 0 0 0 6.598 1.935c7.915 0 12.243-6.553 12.243-12.243 0-.187-.004-.372-.013-.556A8.736 8.736 0 0 0 22 4.599z"/>
                        </svg>
                    </a>
                </div>
            </div>

            <div class="footer-section footer-links">
                <h4 class="footer-title">Quick Links</h4>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Properties</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Services</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </div>

            <div class="footer-section footer-links">
                <h4 class="footer-title">Property Types</h4>
                <ul>
                    <li><a href="#">Residential</a></li>
                    <li><a href="#">Commercial</a></li>
                    <li><a href="#">Luxury Homes</a></li>
                    <li><a href="#">Investment Properties</a></li>
                    <li><a href="#">Land</a></li>
                </ul>
            </div>

            <div class="footer-section contact-info">
                <h4 class="footer-title">Contact Us</h4>
                <ul>
                    <li>
                        <svg fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M3 5a2 2 0 012-2h3.28a1 1 0 01.948.684l1.498 4.493a1 1 0 01-.502 1.21l-2.257 1.13a11.042 11.042 0 005.516 5.516l1.13-2.257a1 1 0 011.21-.502l4.493 1.498a1 1 0 01.684.949V19a2 2 0 01-2 2h-1C9.716 21 3 14.284 3 6V5z"></path>
                        </svg>
                        (555) 123-4567
                    </li>
                    <li>
                        <svg fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M3 8l7.89 5.26a2 2 0 002.22 0L21 8M5 19h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v10a2 2 0 002 2z"></path>
                        </svg>
                        info@yourrealestate.com
                    </li>
                    <li>
                        <svg fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z"></path>
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 11a3 3 0 11-6 0 3 3 0 016 0z"></path>
                        </svg>
                        123 Real Estate Lane, City, State 12345
                    </li>
                </ul>
            </div>
        </div>

        <div class="footer-bottom">
            <p>
                &copy; 2024 Your Real Estate Co. All Rights Reserved | 
                <a href="#">Privacy Policy</a> | 
                <a href="#">Terms of Service</a>
            </p>
        </div>
    </footer>
        </>
    );
}