package com.graymatter;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Employee> employeeSet = new LinkedHashSet<>();

        // Adding employees to the set
        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(2, "Bob");
        Employee emp3 = new Employee(3, "Charlie");

        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        // Displaying the set
        System.out.println("Employees in the set:");
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }

        // Removing an employee from the set
        Employee empToRemove = new Employee(2, "Bob");
        employeeSet.remove(empToRemove);
        System.out.println("\nAfter removing Bob:");
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }

        // Checking if an employee is in the set
        Employee empToCheck = new Employee(1, "Alice");
        boolean containsEmployee = employeeSet.contains(empToCheck);
        System.out.println("\nContains Alice: " + containsEmployee);

        // Iterating over the set using an iterator
        System.out.println("\nIterating using an iterator:");
        Iterator<Employee> iterator = employeeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the set
        employeeSet.clear();
        System.out.println("\nAfter clearing the set:");
        System.out.println("Is the set empty? " + employeeSet.isEmpty());
    }
}
