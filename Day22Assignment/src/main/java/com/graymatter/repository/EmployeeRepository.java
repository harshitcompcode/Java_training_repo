package com.graymatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	

}
