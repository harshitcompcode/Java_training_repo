package com.graymatter.Assignment;

import java.util.Scanner;

public class Customer extends User {

	private String address;
	private String phoneNumber;

 
	public Customer(String username, String password, String address, String phoneNumber) {
		super(username, password);
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

  @Override
  	public void getDetails() {
	  	System.out.println("Customer Details:");
	  	System.out.println("Username: " + getUsername());
	  	System.out.println("Address: " + address);
	  	System.out.println("Phone Number: " + phoneNumber);
  	}

 @Override
 	public void setDetails() {
	 	Scanner scanner = new Scanner(System.in);
     
	 	System.out.print("Enter new address: ");
	 	this.address = scanner.nextLine();
     
	 	System.out.print("Enter new phone number: ");
	 	this.phoneNumber = scanner.nextLine();
 	}
}
