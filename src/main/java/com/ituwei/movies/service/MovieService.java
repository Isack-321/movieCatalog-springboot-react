package com.ituwei.movies.service;

import com.ituwei.movies.model.Movie;
import com.ituwei.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
   private MovieRepository movieRepo;

    public List<Movie> getMovies(){
        return movieRepo.findAll();
    }

    public Optional<Movie> findMovieByImdb(String imdb){
        return movieRepo.findMovieByImdbId(imdb);
    }
}
