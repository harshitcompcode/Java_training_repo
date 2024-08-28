package com.graymatter.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;

public interface EmployeeServiceInterface {

	
	public ResponseEntity<?> getAllEmployee();
	
	public Employee addEmployee(Employee e);
	public List<Employee> getAllEmployeeByCity(String city);
	public Employee getEmployeeById(int id)throws ResourceNotFoundException;
	
	public List<Employee> getAllEmployeeByDepartmentId(int id);
	
	public List<Employee>findEmployeeStartsWith(String letter);
	
	public List<Employee>findEmployeeBySal(int sal);
	
	
}
