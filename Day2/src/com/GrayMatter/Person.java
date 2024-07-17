package com.GrayMatter;
import java.util.*;

public class Person {
	
	private String name;
	private int id;
	private String mobile;
	private String email;
	private Date dob;
	public Person(String name, int id, String mobile, String email, Date dob) {
		super();
		System.out.println("from person with parameters");
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
	}
	public Person() {
		super();
		System.out.println("from person");
	}
	
	
	
}
