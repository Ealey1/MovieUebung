package com.hsb.movie.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(path = "/movies" )
public class MovieController {
    private final MovieServices movieServices;
    @Autowired
    public MovieController(MovieServices movieServices) {
        this.movieServices = movieServices;
    }

    @GetMapping
    public List<Movie> movieList(){
        return movieServices.getMovies();
    }
    @PostMapping
    public ResponseEntity<Integer> addMovie(@RequestBody Movie movie) {
        if (movie.getName() != null) {
            movieServices.addNewMovie(movie);
            return new ResponseEntity(movie.getId(),HttpStatus.CREATED);
        }
        else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}