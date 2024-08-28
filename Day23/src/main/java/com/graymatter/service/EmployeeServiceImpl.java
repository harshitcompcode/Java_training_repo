package com.graymatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.entities.Department;
import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;
import com.graymatter.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface{
	
	
	@Autowired
	EmployeeDao dao;
	
	
	@Override
	public ResponseEntity<?>getAllEmployee(){
		
		return dao.getAllEmployee();
		
	}
	
	@Override
	public Employee addEmployee(Employee e) {
		return dao.addEmployee(e);
		
		
	}
	
	public List<Employee> getAllEmployeeByCity(String city){
		return dao.getAllEmployeeByCity(city);
	}
	
	 
	public Employee getEmployeeById(int id) throws ResourceNotFoundException {
		return dao.getEmployeeById(id);
	}

	

	public List<Employee> getAllEmployeeByDepartmentId(int deptId) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeByDepartmentId(deptId);
	}

	@Override
	public List<Employee> findEmployeeStartsWith(String letter) {
		// TODO Auto-generated method stub
		return dao.findEmployeeStartsWith(letter);
	}

	@Override
	public List<Employee> findEmployeeBySal(int sal) {
		// TODO Auto-generated method stub
		return dao.findEmployeeBySal(sal);
	}
	
	

}
