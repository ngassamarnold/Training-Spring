package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;
import com.mycompany.dvdstore.service.MovieService;
import com.mycompany.dvdstore.service.MovieServiceInterface;


public class App 
{

	public static void main( String[] args )
    {
		MovieController movieController = new MovieController();
		MovieService movieService=new MovieService();
		movieController.setMovieService(movieService);
		GoLiveMovieRepository movieRepository=new GoLiveMovieRepository();
		movieService.setMovieRepositoryInterface(movieRepository);
		movieController.addUsingConsle();
       
    }
    
}
