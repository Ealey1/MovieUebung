package com.hsb.movie.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}