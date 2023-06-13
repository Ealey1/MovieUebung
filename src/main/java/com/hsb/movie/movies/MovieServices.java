package com.hsb.movie.movies;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class MovieServices {
    public List<Movie> getMovies(){
        return List.of(
                new Movie(
                        "Prey"
                )
        );
    }
}
