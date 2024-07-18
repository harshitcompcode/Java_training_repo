package com.grayMatter;

public class Main {

	public static void main(String[] args) throws ageNotSufficientException {
		
		Person p = new Person("Harshit","30091183",19);
		if(p.getAge()<18)
			throw new ageNotSufficientException("Person is Underage");
		else {
			System.out.println("Person is eligible to cast vote");
			System.out.println(p);
			
		}
	}

}
