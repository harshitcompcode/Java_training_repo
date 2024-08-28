package com.graymatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graymatter.service.AuthorService;

@SpringBootApplication
public class Day25Application implements CommandLineRunner{
	
	
	@Autowired
	AuthorService service;
	
	

	public static void main(String[] args) {
		SpringApplication.run(Day25Application.class, args);
	}
	
	
	public void run(String... args) throws Exception {
		service.saveAuthorWithBooks();
	}

}
