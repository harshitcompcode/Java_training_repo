package com.graymatter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.graymatter.dao.PersonDao;
import com.graymatter.entities.Person;

@Service
public class PersonServiceImpl implements PersonServiceInterface {

    @Autowired
    PersonDao dao;
    
    @Override
    public ResponseEntity<?> getAllPersons() {
        return dao.getAllPersons();
    }

    @Override
    public ResponseEntity<?> addPerson(Person person) {
        return dao.addPerson(person);
    }
    
    @Override
    public void deletePerson(int id) {
    	 dao.deletePerson(id);
    }

	@Override
	public Person updatePerson(Person person) {
		return dao.updatePerson(person);
	}
	
	@Override
	public Optional<Person> getPersonById(long id) {
		
		return dao.getPersonById(id);
	}
    
    
}
