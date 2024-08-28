package com.graymatter.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Person;
import com.graymatter.repository.PersonRepository;

@Repository
public class PersonDao {

    @Autowired
    PersonRepository repository;
    
    
    public ResponseEntity<?>addPerson(Person person){
    	Map<String,Object> map = new HashMap<String, Object>();
    	Person p = repository.save(person);
    	if(p!=null) {
    		map.put("status",11);
    		map.put("data",p);
    		return new ResponseEntity<>(map,HttpStatus.CREATED);
    	}
    	else {
    		map.put("status",20);
    		map.put("data","Not Saved");
    		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
    	}
    	
    	
    }
    
    public Person updatePerson(Person person) {
    	return repository.save(person); 
    	
    	
    }
    
    public ResponseEntity<?>getAllPersons(){
    	List<Person> pList = repository.findAll();
    	Map<String,Object> map = new HashMap<String,Object>();
    	
    	if(!pList.isEmpty()) {
    		map.put("status",10);
    		map.put("data",pList);
    		return new ResponseEntity<>(map,HttpStatus.OK);
    	}
    	else {
    		map.put("status",20);
    		map.put("data","List is empty");
    		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
    	}
    	
    }
    
    
    public void deletePerson(long id) {
    	Optional<Person> person = repository.findById(id);
    	repository.delete(person.get());
    }
    
    public Optional<Person> getPersonById(long id) {
    	Optional<Person> person = repository.findById(id);
    	return person;
    }
    
    
    
    
}
