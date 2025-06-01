package com.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    //template
    @Autowired
    private MongoTemplate mongoTemplate;
    //times when repo is not suitable ,
    // form up new dynamic query, talk to db, do the job inside db without repo
    public Review createReview(String reviewBody, String imdbId){
      Review review = reviewRepository.insert(new Review(reviewBody));

      mongoTemplate.update(Movie.class)
              .matching(Criteria.where("imdbId").is(imdbId))
              .apply(new Update().push("reviewIds").value(review))
              .first();

      return review;

    }
}
