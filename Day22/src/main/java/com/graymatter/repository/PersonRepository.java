package com.graymatter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	

	
	
}
