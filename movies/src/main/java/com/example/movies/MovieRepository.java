package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//data access layer for api, actually talking to db

@Repository
public interface MovieRepository extends MongoRepository <Movie, ObjectId>{
  Optional<Movie>findMovieByImdbId(String imdbId); //will know what i want to do, if not unique i get more
}
