package com.mycompany.dvdstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

@Controller
public class HomeController {

	@Autowired
	private MovieServiceInterface movieServiceInterface;
	
	@RequestMapping("/dvdstore-home")
	@ModelAttribute("movies")
	public List<Movie> displayHome() {
		List<Movie> movieList =movieServiceInterface.getMovieList();
		return movieList;
	}
}
