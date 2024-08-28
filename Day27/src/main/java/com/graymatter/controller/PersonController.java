package com.graymatter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.graymatter.entities.Person;
import com.graymatter.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService service;
	
	
	@GetMapping("/person")
	public List<Person> getAllPersons(){
		return service.getAllPerson();
	}
	
	
	@GetMapping("/person/name/{name}")
	public List<Person> getAllPersonsByName(@PathVariable("name") String name)
	{
		return service.getAllPersonsByName(name);
	}
	
	
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person p) {
		return service.addPerson(p);
	}
	
	@GetMapping("/person/age/{age}")
	public List<Person> getAllPersonsByAge(@PathVariable("age") int age)
	{
		return service.findByAge(age);
	}
	
	
}
