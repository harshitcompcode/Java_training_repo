package com.graymattter;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String city;
    private String aadharNum;

    public Person(String name, int age, String city, String aadharNum) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.aadharNum = aadharNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getAadharNum() {
        return aadharNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return aadharNum.equals(person.aadharNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aadharNum);
    }
}

