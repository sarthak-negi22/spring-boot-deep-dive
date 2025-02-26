package com.sarthak.FirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication		//	this annotation specifies that this particular application is spring boot application
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}
}

//	dependencies in spring boot mean external libraries or modules that your application would need to run the application

// spring boot use maven/gradle for managing dependencies
