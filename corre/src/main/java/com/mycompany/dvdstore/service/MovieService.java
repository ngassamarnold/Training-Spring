package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface{
	
	private MovieRepositoryInterface movieRepositoryInterface;
	//private GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
	//private MovieRepository movieRepository = new MovieRepository();

	public void registerMovie(Movie movie) {
		
		movieRepositoryInterface.add(movie);;
	}

}
