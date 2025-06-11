package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//most of the bussiness logic , uses the repo and talks to the database and returns to api
@Service
public class MovieService {
   @Autowired //let the framework know we want the framework to instantiate MovieRepository
    private MovieRepository movieRepository;
    //databse access method
    public List<Movie> allMovie(){

     return movieRepository.findAll();
    }
    public Optional<Movie> oneMovie(String imdbId){
     return movieRepository.findMovieByImdbId(imdbId);
    }

}
