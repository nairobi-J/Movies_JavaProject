package com.example.movies;

import com.fasterxml.jackson.annotation.JsonProperty; // Add this import
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    //withoutJsonProperty it wont work



    @Id
    @JsonProperty("id") // Explicitly map to JSON field "id"
    private ObjectId id;

    @JsonProperty("imdbId") // Explicitly map to JSON field "imdbId"
    private String imdbId;

    @JsonProperty("")
    private String title;

    @JsonProperty("")
    private String releaseDate;

    @JsonProperty("trailerLink")
    private String trailerLink;

    @JsonProperty("poster")
    private String poster;

    @JsonProperty("genres")
    private List<String> genres;

    @JsonProperty("backdrops")
    private List<String> backdrops;

    @JsonProperty("reviewIds")
    private List<String> reviewIds;
}