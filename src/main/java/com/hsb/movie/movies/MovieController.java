package com.hsb.movie.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RestController
@RequestMapping(path = "/movies" )
public class MovieController {
    private final MovieRepository movieRepository;
    private final MovieServices movieServices;
    @Autowired
    public MovieController(MovieServices movieServices, MovieRepository movieRepository) {
        this.movieServices = movieServices;
        this.movieRepository = movieRepository;
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
    @GetMapping(path = "/{id}")
    public ResponseEntity <List<Movie>> getById(@PathVariable Integer id){
        if (id >= 0){
            var v = movieRepository.findById(id);
            if (v == null){
                return new ResponseEntity(null, HttpStatus.NOT_FOUND);
            }
            else {
                return new ResponseEntity(v, HttpStatus.OK);
            }
        }
        return null;
    }
}