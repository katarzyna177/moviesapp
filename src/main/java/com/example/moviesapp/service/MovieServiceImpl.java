package com.example.moviesapp.service;

import com.example.moviesapp.aspect.MailAspect;
import com.example.moviesapp.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    private List<Movie> movieList;

    public MovieServiceImpl() {
        this.movieList = new ArrayList<>();
        movieList.add(new Movie(1L, "Zabójczy rejs", 2019, "USA"));
        movieList.add(new Movie(2L, "Karate Kid", 2010, "USA"));
        movieList.add(new Movie(3L, "Podróż na tajemniczą wyspę", 2012, "USA"));
    }

    @Override
    public List<Movie> getAllMovies() {
        return this.movieList;
    }

    @Override
    @MailAspect
    public boolean addMovie(Movie movie) {
        return this.movieList.add(movie);
    }


}