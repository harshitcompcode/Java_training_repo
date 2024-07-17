package com.GrayMatter;

import java.util.Date;

public class Customer extends Person {

	private double orderSum;
	private int orderId;
	public Customer(String name, int id, String mobile, String email, Date dob, double orderSum, int orderId) {
		super(name, id, mobile, email, dob);
		this.orderSum = orderSum;
		this.orderId = orderId;
	}
	public Customer() {
		super();
	}
	
	
	
}
