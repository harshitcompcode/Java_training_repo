package com.graymatter;

public class Person {
    private int id;
    private String name;
    private int age;
    private String mobile;
    private String email;

    // Constructor
    public Person(int id, String name, int age, String mobile, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.email = email;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email;
    
    
    
    }
}
