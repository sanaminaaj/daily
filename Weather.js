import { useEffect, useState } from "react";
import "./styles.css";

export default function App() {
  const [response, setResponse] = useState(null);
  const [dataFetch, setDataFetch] = useState(false);
  const [error, setError] = useState(null);

  const getWeatherData = (latitude, longitude) => {
    fetch(
      `https://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&appid=bf909b4a90c47e810fc156dc73c0ed75`
    )
      .then((res) => res.json())
      .then((res) => {
        console.log("Weather Data:", res);
        setResponse(res);
        setDataFetch(true);
      })
      .catch((err) => {
        console.error("Error fetching weather data:", err);
        setError("Failed to fetch weather data.");
      }); // ✅ Closing brace fixed
  };

  const showPosition = (pos) => {
    getWeatherData(pos.coords.latitude, pos.coords.longitude);
  };

  useEffect(() => {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(showPosition, () =>
        setError("Geolocation permission denied.")
      );
    } else {
      setError("Geolocation is not supported by your browser.");
    }
  }, []); // ✅ Fixed placement of useEffect

  return (
    <div className="App">
      {error ? (
        <div className="error">{error}</div>
      ) : dataFetch ? (
        <>
          <div className="city-name">{response.name}</div>
          <div className="description">{`Temperature: ${(
            response.main.temp - 273.15
          ).toFixed(2)}°C`}</div>
          <div className="description">{`Description: ${response.weather[0].description}`}</div>
          <div className="description">{`Humidity: ${response.main.humidity}%`}</div>
        </>
      ) : (
        <div>Loading...</div>
      )}
    </div>
  );
}
