package com.grayMatter;



public abstract class AbstractClass {//if a method is abstract then the class must be abstract

	
	private String name;
	public String printName(String name) {
		this.name=name;
		return this.name;
		
		
	}
	
	public abstract void sayHello();
}
