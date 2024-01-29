package dev.manali.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private movieRepository movieRepository;
    public List<Movie> allMovies()
    {
        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }
}
