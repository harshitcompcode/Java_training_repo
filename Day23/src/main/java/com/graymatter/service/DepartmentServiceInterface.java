package com.graymatter.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.graymatter.entities.Department;

public interface DepartmentServiceInterface {

	Department addDepartment(Department d);

	List<Department> getAllDepartment();

	public int deleteDepartment(int id);

}
