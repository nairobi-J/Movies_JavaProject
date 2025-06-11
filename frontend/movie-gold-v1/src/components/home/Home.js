import React from 'react';
import Hero from '../hero/Hero';


const Home = ({movies}) => {
  return (
    <div>
      Welcome!!!
     
      <Hero movies={movies}/>
    </div>
  );
}

export default Home;
