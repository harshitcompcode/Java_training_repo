package com.GrayMatter;

import java.util.Date;

public class Employee extends Person {
	
	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", salary=" + salary + ", doj=" + doj + ", toString()="
				+ super.toString() + "]";
	}

	public Employee(String name, int id, String mobile, String email, Date dob, String deptName, double salary,
			Date doj) {
		super(name, id, mobile, email, dob);
		this.deptName = deptName;
		this.salary = salary;
		this.doj = doj;
	}

	private String deptName;
	private double salary;
	private Date doj;
	
	public Employee() {
		super();
	}
	
	
}
