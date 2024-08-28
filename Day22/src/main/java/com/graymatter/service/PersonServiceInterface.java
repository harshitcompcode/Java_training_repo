package com.graymatter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.graymatter.entities.Person;

public interface PersonServiceInterface {

	public ResponseEntity<?> getAllPersons();

	public ResponseEntity<?> addPerson(Person person);
	

	void deletePerson(int id);

	Person updatePerson(Person person);

	Optional<Person> getPersonById(long id);
	
}
