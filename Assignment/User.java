package com.graymatter.Assignment;


public abstract class User {
 private String username;
 private String password;

 public User(String username, String password) {
     this.username = username;
     this.password = password;
 }


 public abstract void getDetails();
 public abstract void setDetails();
 

 public String getUsername() {
     return username;
 }

 public void setUsername(String username) {
     this.username = username;
 }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }
}
