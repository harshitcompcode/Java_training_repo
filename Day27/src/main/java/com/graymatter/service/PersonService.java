package com.graymatter.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.entities.Person;
import com.graymatter.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repository;
	
	
	public List<Person> getAllPerson(){
		return repository.findAll()
;	}
	
	public List<Person> getAllPersonsByName(String name){
		return repository.findByName(name);
	}
	
	public Person addPerson(Person p) {
		return repository.save(p);
	}
	
	public List<Person>findByAge(int age){
		return repository.findByAge(age);
	}
	
	
	
}
