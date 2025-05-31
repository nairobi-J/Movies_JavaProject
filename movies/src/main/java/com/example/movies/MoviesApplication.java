package com.example.movies;

import org.springframework.boot.SpringApplication;
//contains run to start spring app
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

//rest api controller not just another class
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}


}
