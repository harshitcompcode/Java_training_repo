package com.grayMatter;

public class Person {

	private String name;
	private String aadharNo;
	private int age;
	public Person(String name, String aadharNo, int age) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.age = age;
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAadharNo() {
		return aadharNo;
	}




	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", aadharNo=" + aadharNo + ", age=" + age + "]";
	}
	
	
	
	
	
	
}
