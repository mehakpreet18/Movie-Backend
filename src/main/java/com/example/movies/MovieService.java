package com.example.movies;

import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class MovieService {

    private static final Logger log = LoggerFactory.getLogger(MovieService.class);
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        log.info("Hi i am in movieservice: {}",movieRepository.findAll());
        return movieRepository.findAll();
    }

//    public Optional<Movie> singleMovie(ObjectId id){
//        return movieRepository.findById(id);
//    }

    public Optional<Movie> SingleMovieByImbdid(String id){
        return movieRepository.findMovieByimdbId(id);
    }
}
