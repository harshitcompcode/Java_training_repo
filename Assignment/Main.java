package com.graymatter.Assignment;

public class Main {
	public static void main(String[] args) {
    
        Customer customer = new Customer("Divyanshu", "pass123", "Bangalore", "9878695041");
        customer.getDetails();
        System.out.println();

        Employer employer = new Employer("Anil", "graypass", "GrayMatter", "Ecoworld");
        employer.getDetails();
        System.out.println();

        Admin admin = new Admin("adminuser", "adminpass");
        admin.getDetails();
    }
}
