package com.example.moviesapp.service;

import com.example.moviesapp.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();
    boolean addMovie(Movie movie);
}
