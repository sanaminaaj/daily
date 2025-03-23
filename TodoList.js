import { useState } from "react";
import "../styles.css";
export default Input = () => {
  const [arr, setArr] = useState([]);
  const [item, setItem] = useState("");
  const handleInput = (e) => {
    setItem(e.target.value);
  };
  const add = () => {
    setArr((prev) => [...prev, item]);
    setItem("");
    console.log(arr);
  };
  const deleteItem = (task) => {
    const arr1 = arr.filter((i) => i !== task);
    setArr(arr1);
    console.log(arr);
  };
  const editItem = (task) => {

  };
  return (
    <div className="box">
      <div className="components">
        <input
          type="text"
          name="item"
          onChange={handleInput}
          value={item}
        ></input>
      </div>
      <div className="components">
        <button onClick={add}>add</button>
      </div>
      <div className="components">
        <ul>
          {arr.map((val, index) => (
            <div>
              <li key={index}>{val}</li>
              <button onClick={() => deleteItem(val)}>delete</button>
              <button onClick={() => editItem(val)}>edit</button>
            </div>
          ))}
        </ul>
      </div>
    </div>
  );
};
