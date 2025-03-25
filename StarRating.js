import React, { useState } from "react";
import { Star } from "lucide-react";
import "../index.css";

export default function Ex() {
  const totalStars = 5; // No need to use useState for a constant value
  const [hover, setHover] = useState(null);
  const [rating, setRating] = useState(0);
        
    
  return (
    <div className="box">
      {[...Array(totalStars)].map((_, index) => {
        const starIndex = index+1 ;
        return (
          <Star
            key={index}
            onClick={()=>setRating(starIndex)}
            className={starIndex <= (hover || rating) ? "yellow" : ""}
            onMouseEnter={() => setHover(starIndex)} // Temporary fill on hover
            onMouseLeave={() => setHover(0)} 
            />
        );
      })}
    </div>
  );
}
