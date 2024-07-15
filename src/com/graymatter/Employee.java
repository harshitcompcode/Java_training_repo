package com.graymatter;

import java.util.Scanner;

//POJO -plain old java object (no Main method )


public class Employee {
	
	//instance variables
	String name;
	int id;
	double sal;
	String mobile;
	String email;
	
//	static String companyName;
//	
	public void setDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details: ");
		this.name = sc.next();
		this.id = sc.nextInt();
		this.sal = sc.nextDouble();
		this.mobile = sc.next();
		this.email = sc.next();
		
	}
	public Employee(String name, int id, double sal, String mobile, String email) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.mobile = mobile;
		this.email = email;
	}
	public void getDetails() {
		System.out.println(this.name+ " "+ this.id+" "+this.sal+" "+this.mobile+" "+this.email);
	}
	
	
	
	
}
