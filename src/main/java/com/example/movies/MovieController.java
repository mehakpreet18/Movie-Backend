package com.example.movies;

import java.util.*;

import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/movies")  // so any requests sends to this particular endpoint going to attended by this class
@CrossOrigin(origins = "http://localhost:3000")

public class MovieController {

    private static final Logger log = LoggerFactory.getLogger(MovieController.class);
    //private static final Logger log = LoggerFactory.getLogger(MovieController.class);
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
//        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id),HttpStatus.OK);
//    }

    @GetMapping("/{id}")
      public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String id){
        return new ResponseEntity<Optional<Movie>>(movieService.SingleMovieByImbdid(id),HttpStatus.OK);
    }
}
