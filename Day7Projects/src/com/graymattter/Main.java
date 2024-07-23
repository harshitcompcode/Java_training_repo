package com.graymattter;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();

        // Adding sample persons
        persons.add(new Person("Alice", 25, "CityA", "1234"));
        persons.add(new Person("Bob", 17, "CityB", "5678"));
        persons.add(new Person("Charlie", 19, "CityC", "9101"));

        // Check for eligibility and handle exceptions
        persons.stream().forEach(person -> {
            try {
                checkEligibility(person);
                System.out.println(person.getName() + " is eligible to vote.");
            } catch (AgeNotSufficientException e) {
                System.out.println(e.getMessage());
            }
        });
    }

    public static void checkEligibility(Person person) throws AgeNotSufficientException {
        if (person.getAge() < 18) {
            throw new AgeNotSufficientException(person.getName() + " is not eligible to vote. Age: " + person.getAge());
        }
    }
}
