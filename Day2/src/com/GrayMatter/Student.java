package com.GrayMatter;

public class Student {

	String name;
	int id;
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	public Student() {
		super();
	}
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
}
