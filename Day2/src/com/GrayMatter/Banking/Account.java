package com.GrayMatter.Banking;

public class Account {

	protected String accNo;
	private String accHolderName;
	private int pin;
	private String bankName;
	private String ifscCode;
	protected double balance;
	
	public Account() {
		super();
	}

	public Account(String accNo, String accHolderName, int pin, String bankName, String ifscCode, double balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.pin = pin;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bankName="
				+ bankName + ", ifscCode=" + ifscCode + ", balance=" + balance + "]";
	}
	
	public void changePin(int curPin, int newPin) {
		if (this.pin == curPin)
			this.pin = newPin;
		else
			System.out.println("Incorrect current PIN.");
	}
	
	public boolean authenticate(int pin) {
		return this.pin == pin;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposited: " + amount + ", New Balance: " + this.balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withDraw(double amount) {
		// To be overridden in subclasses
		System.out.println("Withdraw method in Account class.");
	}
}