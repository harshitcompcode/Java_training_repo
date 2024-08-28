package com.graymatter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString



@NamedQuery(name = "Harshit", query="select p from Person p where p.name = :name")
@NamedQuery(name= "findByAge",query = "select p from Person p where p.age = :age")


public class Person {

	String name;
	@Id
	int id;
	int age;
	
	
}
