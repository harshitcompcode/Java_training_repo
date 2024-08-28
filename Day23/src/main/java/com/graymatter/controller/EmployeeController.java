package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;
import com.graymatter.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/v1")

public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;
	
	
	
	@GetMapping("/employee")
	public ResponseEntity<?>getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		return service.addEmployee(e);
	}
	

	@GetMapping("/employee/city/{city}")
	public List<Employee> getAllEmployeeByCity(@PathVariable("city") String city)
	{
		return service.getAllEmployeeByCity(city);
	}
	
	
	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable("id") int id) throws ResourceNotFoundException{
		
		return service.getEmployeeById(id);
	}
	
	
	@GetMapping("employee/department/{deptId}")
    public List<Employee> getEmployeesByDepartmentId(@PathVariable int deptId) {
        
		return service.getAllEmployeeByDepartmentId(deptId);
    }
	
	@GetMapping("employee/firstletter/{s}")
	public List<Employee>GetEmployeeStarts(@PathVariable("s") String s){
		return service.findEmployeeStartsWith(s);
	}
	
	@GetMapping("employee/salary/{s}")
	public List<Employee>GetEmployeeStarts(@PathVariable("s") int s){
		return service.findEmployeeBySal(s);
	}
	
}
