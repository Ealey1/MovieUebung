package com.hsb.movie.movies;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Service
public class MovieServices {
    private static MovieRepository instance = new Movie();
    private List<Movie> movies = new ArrayList<>();
    public List<Movie> getMovies(){
        return movies;
    }

    public void addNewMovie(Movie movie) {
        movie.setId(Movie.getNumOfInstances()-2);
        movie.setName(movie.getName());
        getMovies().add(movie);
    }
}
