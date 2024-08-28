package com.graymatter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	
	public Employee addEmployee(Employee e) {
		return dao.addEmployee(e);
	}
	
	public Employee updateEmployee(Employee e) {
		return dao.updateEmployee(e);
	}
	 public ResponseEntity<?>getAllEmployee(){
		 return dao.getAllEmployee();
	 }
	
	
	
	
}
