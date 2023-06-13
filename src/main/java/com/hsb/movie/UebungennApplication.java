package com.hsb.movie;

import com.hsb.movie.movies.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class UebungennApplication {

	public static void main(String[] args) {
		SpringApplication.run(UebungennApplication.class, args);
	}


	@GetMapping(path = "/movies")
	//es funktioniert so alles. kp was der default path ist und wie es ohne path funktioniert hätte
	public List<Movie> movieList(){
		return List.of(
				new Movie(
						"Prey"
				)
		);

	};
}