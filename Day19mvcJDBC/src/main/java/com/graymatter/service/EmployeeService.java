package com.graymatter.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.model.Employee;


@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeDao empDao;
	
	public List<Employee> getAllEmployee(){
		
		return empDao.getAllEmployees();
		
	}
	
	public int addEmployee(Employee employee) {
		return empDao.addEmployee(employee);
	}
	
	public int updateEmployee(Employee employee) {
		return empDao.updateEmployee(employee);
	}
	public int deleteEmployee(Employee employee) {
		return empDao.deleteEmployee(employee);
	}
	
	public Employee getEmployeeById(int empId) throws SQLException {
		return empDao.selectById(empId);
	}
	
	
	
}
