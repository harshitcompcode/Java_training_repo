package com.grayMatter;

public class demoOnAbstracr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AbstractClass ac = new AbstractClass(); abstract classes do not have instances
		AbstractChildClass ac = new AbstractChildClass();
		ac.sayHello();
		System.out.println(ac.printName("Harshit"));
		
	
	}

}
