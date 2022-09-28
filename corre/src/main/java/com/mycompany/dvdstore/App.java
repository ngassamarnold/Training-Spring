package com.mycompany.dvdstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mycompany.dvdstore.controller.MovieController;


@SpringBootApplication
public class App 
{

	public static void main( String[] args )
    {
		//ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext context= new AnnotationConfigApplicationContext(App.class);
		ApplicationContext context= SpringApplication.run(App.class, args);
		MovieController lController= context.getBean(MovieController.class);
		
		lController.addUsingConsle();       
    }
    
}

//run App ->  mvn spring-boot:run 
//mvn-> clean install generate build
//exc jar  -> java -jar core-0.0.1-SNAPSHOT.jar