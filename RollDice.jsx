import React, { useEffect, useState } from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faDiceOne,
  faDiceTwo,
  faDiceThree,
  faDiceFour,
  faDiceFive,
  faDiceSix,
} from "@fortawesome/free-solid-svg-icons";
import "../Examples/Ex2.css";
export default function Ex2() {
  const [randomNumDice1, setRandomNumDice1] = useState(0);
  const [randomNumDice2,setRandomNumDice2] = useState(0);
  const diceIcons = [
    faDiceOne,
    faDiceTwo,
    faDiceThree,
    faDiceFour,
    faDiceFive,
    faDiceSix,
  ];
  const handleNum = () => {
    setRandomNumDice1(diceIcons[Math.floor(Math.random() * 6)]);
    setRandomNumDice2(diceIcons[Math.floor(Math.random() * 6)]);

  };
  return (
    <div>
      <FontAwesomeIcon icon={randomNumDice1} size="4x" className="icon1" />
      <FontAwesomeIcon icon={randomNumDice2} size="4x" className="icon1" />
      <button className="button" onClick={handleNum}>
        Start Now
      </button>
    </div>
  );
}

Ex2.css
.icon1{
    padding:3px;

}
.button{
    width: 100px;
    border-radius: 3px solid black;
    background-color: black;
    color: white;
    display: block;
}
