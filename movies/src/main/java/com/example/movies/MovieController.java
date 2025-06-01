package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//api layer , concerns about task, getting req returns res, nothing else,
// using service class to delegate the task of fetching from database and giving it to api layer,
// calls allmovies, gets the list of movie returns with the status http.ok,
import java.util.List;
import java.util.Optional;

//this is first official  restapi  controller
@RestController
@RequestMapping("/api/v1/movies")

public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){ //reponse entity of typelist movie
        return new ResponseEntity<List<Movie>>(movieService.allMovie(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getOneMovie(@PathVariable String id){  //whatever we getin this path we will cnvert it to objrct id called id
        return new ResponseEntity<Optional<Movie>>(movieService.oneMovie(id), HttpStatus.OK);

    }

}
