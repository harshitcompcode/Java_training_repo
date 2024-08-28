package com.graymatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.graymatter.entities.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
	
	
//	public List<Person> findByName();
	@Query(name ="Harshit")
	public List<Person> findByName(@Param("name") String name);
	
	@Query(name = "findByAge")
	public List<Person>findByAge(@Param("age") int age);
	
	

}
