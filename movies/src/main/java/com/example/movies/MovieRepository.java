package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//data access layer for api, actually talking to db

@Repository
public interface MovieRepository extends MongoRepository <Movie, ObjectId>{

}
