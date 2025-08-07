import React, { useState } from 'react';

const MiniHome3D = () => {
  const [rotation, setRotation] = useState({ x: 0, y: 0 });

  const handleMouseMove = (e) => {
    const { left, top, width, height } = e.currentTarget.getBoundingClientRect();
    const x = ((e.clientX - left) / width - 0.5) * 20;
    const y = ((e.clientY - top) / height - 0.5) * -20;
    setRotation({ x, y });
  };

  const handleMouseLeave = () => {
    setRotation({ x: 0, y: 0 });
  };

  return (
    <div 
      className="perspective-container w-80 h-64 mx-auto"
      onMouseMove={handleMouseMove}
      onMouseLeave={handleMouseLeave}
    >
      <div 
        className="home-3d-model transition-transform duration-100 ease-out transform"
        style={{
          transform: `rotateX(${rotation.y}deg) rotateY(${rotation.x}deg)`,
          transformStyle: 'preserve-3d'
        }}
      >
        {/* House Base */}
        <div 
          className="absolute bg-gray-200 w-64 h-40 bottom-0 left-1/2 -translate-x-1/2 rounded-b-lg"
          style={{ transform: 'translateZ(-10px)' }}
        />

        {/* House Body */}
        <div 
          className="absolute bg-white w-56 h-48 bottom-0 left-1/2 -translate-x-1/2 rounded-lg shadow-lg border border-gray-200"
          style={{ transform: 'translateZ(10px)' }}
        >
          {/* Windows */}
          <div className="absolute left-8 top-8 w-16 h-12 bg-blue-100 rounded-md" style={{ transform: 'translateZ(20px)' }} />
          <div className="absolute right-8 top-8 w-16 h-12 bg-blue-100 rounded-md" style={{ transform: 'translateZ(20px)' }} />
        </div>

        {/* Roof */}
        <div 
          className="absolute w-0 h-0 border-l-32 border-r-32 border-b-32 border-l-transparent border-r-transparent border-b-red-400 left-1/2 -translate-x-1/2 -top-16"
          style={{ 
            transform: 'translateZ(5px) rotateX(-10deg)',
            borderLeftWidth: '112px',
            borderRightWidth: '112px',
            borderBottomWidth: '64px'
          }}
        />

        {/* Door */}
        <div 
          className="absolute bottom-0 left-1/2 -translate-x-1/2 w-16 h-24 bg-red-800 rounded-b-lg"
          style={{ 
            transform: 'translateZ(15px)',
            transformOrigin: 'bottom center'
          }}
        >
          {/* Doorknob */}
          <div 
            className="absolute right-3 top-1/2 w-2 h-2 bg-yellow-500 rounded-full"
            style={{ transform: 'translateZ(20px)' }}
          />
        </div>
      </div>
    </div>
  );
};

export default MiniHome3D;