package com.graymatter.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Department;

import com.graymatter.repository.DepartmentRepository;
import com.graymatter.repository.EmployeeRepository;


@Repository
public class DepartmentDao {

	
	@Autowired
	DepartmentRepository repository;
	
//	public ResponseEntity<?> getAllDepartment(){
//		List<Department> pList = repository.findAll();
//    	Map<String,Object> map = new HashMap<String,Object>();
//    	
//    	if(!pList.isEmpty()) {
//    		map.put("status",10);
//    		map.put("data",pList);
//    		return new ResponseEntity<>(map,HttpStatus.OK);
//    	}
//    	else {
//    		map.put("status",20);
//    		map.put("data","List is empty");
//    		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
//    	}
//	}
	public List<Department>getAllDepartment(){
		return repository.findAll();
	}
	
	public Department addDepartment(Department e) {
		return repository.save(e);
	}

	public int deleteDepartment(int id) {
		// TODO Auto-generated method stub
		return repository.deleteByDeptId(id);
	}
	
	
	
	
	
}
