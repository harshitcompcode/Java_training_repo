package com.graymatter.dao;
 
import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;
 
import com.graymatter.model.Employee;
 
public class EmployeeRowMapper implements RowMapper<Employee> {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
		return e;
	}
 
}
