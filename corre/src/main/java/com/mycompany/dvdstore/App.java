package com.mycompany.dvdstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.dvdstore.controller.MovieController;


public class App 
{

	public static void main( String[] args )
    {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

		MovieController lController= context.getBean(MovieController.class);
		
		lController.addUsingConsle();       
    }
    
}
