package com.graymatter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.graymatter.entities.Department;
import com.graymatter.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	public List<Employee>findByCity(String city);
	
	
	//@Query(value = "select * from project23employee e where e.dept_id=:?",nativeQuery=true)
	
	@Query(value ="select * from project23Employee where emp_name like ?%",nativeQuery=true)
	public List<Employee>findEmployeeStartsWith(@Param("letter")String letter);
	
	
	List<Employee> findByDepartmentDeptId(int deptId);
	
	List<Employee>findByEmpNameStartsWith(String letter);
	List<Employee>findByEmpSal(int sal);
	

	
	
	
	
	
	
	
}
