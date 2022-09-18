package com.mycompany.dvdstore;

import java.util.Scanner;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner sc;

	public static void main( String[] args )
    {
        System.out.println( "Saisisez le titre du film" );
        sc = new Scanner(System.in);
        String titre= sc.nextLine();
        
        System.out.println( "Saisisez le genre du film" );
        String genre= sc.nextLine();
        
        Movie movie=new Movie();
        movie.setGenre(genre);
        movie.setTitle(titre);
        
        MovieService movieService=new MovieService();
        movieService.registerMovie(movie);
    }
    
}
