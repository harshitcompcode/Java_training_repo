package com.GrayMatter.Banking;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("SA12345", "John Doe", 1234, "Bank of Earth", "BOE123", 1000.0);
		CurrentAccount currentAccount = new CurrentAccount("CA12345", "Jane Doe", 4321, "Bank of Earth", "BOE123", 500.0, 1000.0);
		
		Scanner scanner = new Scanner(System.in);
		int choice, pin;
		double amount;
		
		while (true) {
			System.out.println("\n1. Deposit\n2. Withdraw from Savings\n3. Withdraw from Current\n4. Change PIN (Savings)\n5. Change PIN (Current)\n6. Check Balance (Savings)\n7. Check Balance (Current)\n8. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					System.out.print("Enter amount to deposit: ");
					amount = scanner.nextDouble();
					System.out.print("Enter PIN for Savings Account: ");
					pin = scanner.nextInt();
					if (savingsAccount.authenticate(pin)) {
						savingsAccount.deposit(amount);
					} else {
						System.out.println("Invalid PIN.");
					}
					break;
				case 2:
					System.out.print("Enter amount to withdraw from Savings: ");
					amount = scanner.nextDouble();
					System.out.print("Enter PIN: ");
					pin = scanner.nextInt();
					if (savingsAccount.authenticate(pin)) {
						savingsAccount.withDraw(amount);
					} else {
						System.out.println("Invalid PIN.");
					}
					break;
				case 3:
					System.out.print("Enter amount to withdraw from Current: ");
					amount = scanner.nextDouble();
					System.out.print("Enter PIN: ");
					pin = scanner.nextInt();
					if (currentAccount.authenticate(pin)) {
						currentAccount.withDraw(amount);
					} else {
						System.out.println("Invalid PIN.");
					}
					break;
				case 4:
					System.out.print("Enter current PIN for Savings Account: ");
					int curPin = scanner.nextInt();
					System.out.print("Enter new PIN: ");
					int newPin = scanner.nextInt();
					savingsAccount.changePin(curPin, newPin);
					break;
				case 5:
					System.out.print("Enter current PIN for Current Account: ");
					curPin = scanner.nextInt();
					System.out.print("Enter new PIN: ");
					newPin = scanner.nextInt();
					currentAccount.changePin(curPin, newPin);
					break;
				case 6:
					System.out.print("Enter PIN for Savings Account: ");
					pin = scanner.nextInt();
					if (savingsAccount.authenticate(pin)) {
						System.out.println("Balance: " + savingsAccount.getBalance());
					} else {
						System.out.println("Invalid PIN.");
					}
					break;
				case 7:
					System.out.print("Enter PIN for Current Account: ");
					pin = scanner.nextInt();
					if (currentAccount.authenticate(pin)) {
						System.out.println("Balance: " + currentAccount.getBalance());
					} else {
						System.out.println("Invalid PIN.");
					}
					break;
				case 8:
					System.out.println("Exiting...");
					scanner.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}
		}
	}
}