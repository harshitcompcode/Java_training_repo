package com.GrayMatter;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
//		Employee emp = new Employee();
//		System.out.println(emp);
//		
		
		
		Employee emp1 = new Employee("Harsh",234,"950854","harshit@gmail.com",new Date("23/7/2020"),"656",600,new Date("02/02/2002"));
		System.out.println(emp1);
		
		System.out.println(emp1 instanceof Person);
		
		Customer c1 = new Customer();
		System.out.println(c1 instanceof Person);
		
	}
}
