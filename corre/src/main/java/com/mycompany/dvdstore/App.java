package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;


public class App 
{

	public static void main( String[] args )
    {
		MovieController movieController = new MovieController();
		DefaultMovieService defaultMovieService=new DefaultMovieService();
		FileMovieRepository movieRepository=new FileMovieRepository();
		movieController.setMovieService(defaultMovieService);
		defaultMovieService.setMovieRepositoryInterface(movieRepository);
		movieController.addUsingConsle();
       
    }
    
}
