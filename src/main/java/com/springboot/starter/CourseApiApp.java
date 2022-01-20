package com.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Sets up default configuration
 * Starts Spring Application Context by 
 * Performing component scanning
 * Starts the tomcat server, Stand Alone.
 * */
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
}
