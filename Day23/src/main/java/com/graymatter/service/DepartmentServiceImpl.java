package com.graymatter.service;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.graymatter.dao.DepartmentDao;
import com.graymatter.entities.Department;

import jakarta.transaction.Transactional;


@Service
public class DepartmentServiceImpl implements DepartmentServiceInterface {

	@Autowired
	DepartmentDao dao;
	
	
	@Override
	public List<Department> getAllDepartment(){
		
		return dao.getAllDepartment();
		
	}
	
	@Override
	public Department addDepartment(Department d) {
		return dao.addDepartment(d);
		
	}
	
	@Transactional
	public int deleteDepartment(int id) {
        return dao.deleteDepartment(id);
	}
	
	
	
}
