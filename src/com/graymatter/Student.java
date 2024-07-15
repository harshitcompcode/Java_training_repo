package com.graymatter;

public class Student {

	private String studName;
	private int id;
	private int n1,n2,n3;
	public Student() {
		super();
	}
	public Student(String studName, int id, int n1, int n2, int n3) {
		super();
		this.studName = studName;
		this.id = id;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	@Override
	public String toString() {
		return "Student [studName=" + studName + ", id=" + id + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
	}
	
	
	
	
	
	
}
