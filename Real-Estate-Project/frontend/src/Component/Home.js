import "./Home.css";
import { Link } from "react-router-dom";
export default function Home() {
  return (
    <>
      <body class="bg-gray-100">

        {/* <MiniHome3D/> */}
        <section class="hero-section text-white py-20 relative">
          <div class="absolute inset-0 hero-overlay z-0"></div>
          <div class="container mx-auto px-4 relative z-10">
            <div class="grid md:grid-cols-2 gap-10 items-center">
              <div class="space-y-6 floating-element">
                <h1 class="text-5xl font-bold gradient-text">
                  Find Your Perfect Home
                </h1>
                <p class="text-xl text-gray-300">
                  Discover dream properties with personalized matching and
                  expert guidance. Your journey home starts here.
                </p>
                <div class="space-x-4" style={{"text-decoration":"none"}}>
                  <Link
                    to={'/exploreproperty'}
                    class="bg-blue-600 px-6 py-3 rounded-lg hover:bg-blue-700 transition"
                  >
                    Search Properties
                  </Link>
                  <Link
                    to={'/findbroker'}
                    class="border border-white px-6 py-3 rounded-lg hover:bg-white hover:text-gray-900 transition"
                  >
                    Contact Broker
                  </Link>
                </div>
              </div>
              <div class="relative">
                <div class="property-card bg-white rounded-xl shadow-2xl overflow-hidden transform hover:scale-105 transition-all duration-300">
                  <img
                    src="/api/placeholder/600/400"
                    alt="Featured Property"
                    class="w-full h-96 object-cover"
                  />
                  <div class="p-6">
                    <h3 class="text-2xl font-bold text-gray-800">
                      Luxury Waterfront Villa
                    </h3>
                    <p class="text-gray-600">Exclusive 4 Bedroom Residence</p>
                    <div class="mt-4 flex justify-between items-center">
                      <span class="text-blue-600 font-bold text-xl">
                        $2,750,000
                      </span>
                      <span class="text-gray-500">1,200 sq ft</span>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
      </body>
    </>
  );
}
