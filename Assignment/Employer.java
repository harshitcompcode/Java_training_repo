package com.graymatter.Assignment;

import java.util.Scanner;

public class Employer extends User {


 private String companyName;
 private String companyAddress;

 public Employer(String username, String password, String companyName, String companyAddress) {
     super(username, password);
     this.companyName = companyName;
     this.companyAddress = companyAddress;
 }


 @Override
 public void getDetails() {
     System.out.println("Employer Details:");
     System.out.println("Username: " + getUsername());
     System.out.println("Company Name: " + companyName);
     System.out.println("Company Address: " + companyAddress);
 }

 @Override
 public void setDetails() {

     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter new company name: ");
     this.companyName = scanner.nextLine();
     
     System.out.print("Enter new company address: ");
     this.companyAddress = scanner.nextLine();
 }
}
