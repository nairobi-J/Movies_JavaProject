import api from './api/axiosConfig';
import { useState, useEffect } from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Layout  from './components/Layout';
import { Routes, Route } from 'react-router-dom';
import Home from './components/home/Home';
function App() {
  const [movies, setMovies] = useState([]);
  const getMovies = async () => {


    try{
      const response = await api.get("api/v1/movies");
      console.log(response.data)
    setMovies(response.data);

    } catch(err){
      console.log(err);
    }
    
  }

  useEffect(() => {
    getMovies();
  }, []);
  return (
    <div className="App">
      <Routes>
       <Route path="/" element={<Layout />}>
          {/* This makes Home the default component to render when the parent Layout route matches '/' */}
          <Route index element={<Home movies={movies} />} />
          {/* Add other nested routes here, e.g., <Route path="movie/:id" element={<MovieDetail />} /> */}
        </Route>
      </Routes>
    </div>
  );
}

export default App;
