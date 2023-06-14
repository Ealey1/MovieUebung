package com.hsb.movie.movies;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MovieRepository {

    private List<Movie> movieList = new ArrayList<Movie>();

    public Movie save (Movie movie){
        movieList.add(movie);
        return movie;
    }

    public List<Movie> getAllMovies(){
        return movieList;
    }
    public Movie findById(int id) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getId() == (id)) {
                return movieList.get(i);
            }
        }
        return null;
    }
}
