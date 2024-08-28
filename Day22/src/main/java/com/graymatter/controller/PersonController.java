package com.graymatter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Person;
import com.graymatter.service.PersonServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    PersonServiceImpl service;
    
    @GetMapping("/person")
    public ResponseEntity<?> getAllPersons() {
        return service.getAllPersons();
    }
    
    @PostMapping("/person")
    public ResponseEntity<?> addPerson(@RequestBody Person person) {
        return service.addPerson(person);
        
    }
    
    @PutMapping("/person")
    public Person updatePerson(@RequestBody Person person) {
    	return service.updatePerson(person);
    }
    
    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") int id) {
    	
    	
    	service.deletePerson(id);
    }
    
    @GetMapping("/person/{id}")
    public Optional<Person> getPersonById(@PathVariable("id") long id) {
    	return service.getPersonById(id);
    	
    }
    
    
    
    
}
