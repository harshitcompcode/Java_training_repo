package com.graymatter.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.entities.Department;
import com.graymatter.repository.DepartmentRepository;
 
@Service
public class DepartmentService {
 
	@Autowired
	DepartmentRepository repository;

	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return repository.save(department);
	}

	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}
}