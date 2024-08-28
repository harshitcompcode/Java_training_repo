package com.graymatter.dao;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.graymatter.model.Employee;
 
import lombok.Setter;
 
@Setter

@Component
public class EmployeeDao {
 
	@Autowired
	private JdbcTemplate jdbcTemplate;
//	
//	
	// Insert query
	public int addEmployee(Employee emp) {
		String query = "INSERT INTO Employee VALUES (" + emp.getEmpId() + ",'" + emp.getEmpName() + "'," + emp.getEmpSal() + ");";
		return jdbcTemplate.update(query);
	}
	//Select query
	public List<Employee> getAllEmployees() {
		String query = "SELECT * FROM Employee;";
		List<Employee> empList = jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList;
	}
	// Update query
	public int updateEmployee (Employee emp) {
		String query = "UPDATE Employee SET empSal=" + emp.getEmpSal() + "WHERE emp_id=" + emp.getEmpId();
		return jdbcTemplate.update(query);
	}

	// Delete query
	public int deleteEmployee (Employee emp) {
		String query = "DELETE FROM Employee WHERE `emp_id` =" + emp.getEmpId();
		return jdbcTemplate.update(query);
	}
	
	public Employee selectById(int id) throws SQLException {
		String query= "SELECT * FROM Employee WHERE `emp_id` = "+id;
		List<Employee>empList = jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList.get(0);
	}
	
	
}