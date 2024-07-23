package com.graymatter;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Customer> customerDeque = new ArrayDeque<>();

        // Adding customers to the deque
        customerDeque.add(new Customer(1, "Alice"));
        customerDeque.add(new Customer(2, "Bob"));
        customerDeque.add(new Customer(3, "Charlie"));

        // Displaying the deque
        System.out.println("Customers in deque:");
        customerDeque.forEach(System.out::println);

        // Removing a customer from the deque
        Customer customerToRemove = new Customer(2, "Bob");
        customerDeque.remove(customerToRemove);
        System.out.println("\nAfter removing Bob:");
        customerDeque.forEach(System.out::println);

        // Checking if a customer is in the deque
        Customer customerToCheck = new Customer(1, "Alice");
        boolean containsCustomer = customerDeque.contains(customerToCheck);
        System.out.println("\nContains Alice: " + containsCustomer);

        // Sorting the deque (by converting to a list first)
        List<Customer> sortedList = customerDeque.stream().collect(Collectors.toList());
        Collections.sort(sortedList, Comparator.comparing(Customer::getName));

        // Displaying the sorted list
        System.out.println("\nSorted customers by name:");
        sortedList.forEach(System.out::println);

        // Updating the deque with the sorted list
        customerDeque.clear();
        customerDeque.addAll(sortedList);
        System.out.println("\nDeque after sorting:");
        customerDeque.forEach(System.out::println);
    }
}
