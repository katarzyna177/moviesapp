package com.example.moviesapp.controller;

import com.example.moviesapp.model.Movie;
import com.example.moviesapp.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies() {
        return this.movieService.getAllMovies();
    }

    @PostMapping
    public boolean addMovie(@RequestBody Movie movie) {
        return this.movieService.addMovie(movie);
    }


}

