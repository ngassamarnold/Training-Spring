package com.mycompany.dvdstore.controller;

import java.util.Scanner;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

public class MovieController {

	private static Scanner sc;
	private static MovieService movieService = new MovieService();

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
