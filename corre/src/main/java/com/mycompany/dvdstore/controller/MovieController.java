package com.mycompany.dvdstore.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

public class MovieController {

	private static Scanner sc;
	//private static MovieService movieService = new MovieService();
	@Autowired
	private MovieServiceInterface movieService;

	public MovieServiceInterface getMovieService() {
		return movieService;
	}

	public void setMovieService(MovieServiceInterface movieService) {
		this.movieService = movieService;
	}

	public void addUsingConsle() {
		System.out.println("Saisisez le titre du film");
		sc = new Scanner(System.in);
		String titre = sc.nextLine();

		System.out.println("Saisisez le genre du film");
		String genre = sc.nextLine();

		Movie movie = new Movie();
		movie.setGenre(genre);
		movie.setTitle(titre);

		movieService.registerMovie(movie);
	}
}
