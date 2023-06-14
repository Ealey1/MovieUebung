package com.hsb.movie.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MovieServices {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieServices(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies(){
        return movieRepository.getAllMovies();
    }

    public void addNewMovie(Movie movie) {
        movieRepository.save(movie);
    }
}
