package com.graymatter.beans;

public class Customer {

	private String name;
	private int id;
	private String mobile;
	private Order order;
//	public Customer(String name, int id, String mobile) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.mobile = mobile;
//	}
	public Customer() {
		super();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Customer(Order order) {
		super();
		this.order = order;
	}
	public Customer(String name, int id, String mobile, Order order) {
		super();
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", mobile=" + mobile + ", order=" + order + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
}
