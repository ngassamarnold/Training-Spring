package com.mycompany.dvdstore.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dvdstore.entity.Movie;

public class MemoryMovieRepository implements MovieRepositoryInterface{

	public static List<Movie> movies = new ArrayList<Movie>();

	public void add(Movie movie) {

		movies.add(movie);
		System.out.println("The movie " + movie.getTitle()+" has been added");

	}

}
