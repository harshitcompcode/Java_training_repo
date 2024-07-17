package com.GrayMatter.Banking;

public class SavingsAccount extends Account{
 
	public SavingsAccount(String accNo, String accHolderName, int pin, String bankName, String ifscCode, double balance) {
		super(accNo, accHolderName, pin, bankName, ifscCode, balance);
	}
	
	@Override
	public void withDraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
		} else {
			System.out.println("Insufficient funds.");
		}
	}

	@Override
	public String toString() {
		return "SavingsAccount [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bankName="
				+ bankName + ", ifscCode=" + ifscCode + ", balance=" + balance + "]";
	}
}
