package com.GrayMatter;

public class DemoOnStatic {

	
	static String name;
	public static void sayHello(String name) {
		
		this.name = name;
		System.out.println("Hello there");
	}
	
	
	
	static {
        System.out.println("Static block executed.");
    }
	
	public static void main(String[] args) {
		sayHello();
	}
	
	public static void main() {
		
		System.out.println("main without argument");
		
	}
	
	
	
	
	
	
	
}
