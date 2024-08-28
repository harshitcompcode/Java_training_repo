package com.graymatter.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Employee;
import com.graymatter.service.EmployeeService;



@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	

	@GetMapping("/employee")
	public ResponseEntity<?>getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		return service.addEmployee(e);
	}
	
	
	
	
	
	
}
