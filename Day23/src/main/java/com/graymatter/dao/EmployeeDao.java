package com.graymatter.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Department;
import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;
import com.graymatter.repository.EmployeeRepository;


@Repository
public class EmployeeDao {
	
	
	@Autowired
	EmployeeRepository repository;
	
	public ResponseEntity<?> getAllEmployee(){
		List<Employee> pList = repository.findAll();
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
	
	public Employee addEmployee(Employee e) {
		return repository.save(e);
	}

	public List<Employee> getAllEmployeeByCity(String city) {
		// TODO Auto-generated method stub
		return repository.findByCity(city);
	}

	public Employee getEmployeeById (int id) throws ResourceNotFoundException {
		// TODO Auto-generated method s
		return repository.findById(id).get();
	}

	public List<Employee> getAllEmployeeByDepartmentId(int deptId) {
		// TODO Auto-generated method stub
		return repository.findByDepartmentDeptId(deptId);
	}
	
	public List<Employee>findEmployeeStartsWith(String letter){
//		return repository.findEmployeeStartsWith(letter);
		return repository.findByEmpNameStartsWith(letter);
	}
	
	public List<Employee>findEmployeeBySal(int sal){
		return repository.findByEmpSal(sal);
	}
	
	
	
	
	
	
}
