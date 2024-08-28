package com.graymatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.Department;
import com.graymatter.entities.Employee;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

	
	
	int deleteByDeptId(int id);
}
