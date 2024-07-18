package com.graymatter.Assignment;

public class Admin extends User {

 public Admin(String username, String password) {
     super(username, password);
 }

 @Override
 public void getDetails() {
     System.out.println("Admin Details:");
     System.out.println("Username: " + getUsername());
 }

 @Override
 public void setDetails() {
    
 
 }
}
