package com.grayMatter;

public interface MyScientificCalculator {

	public double power(int a,int b);
	public double squareRoot(int a);
	public int add(int a, int b);
	public int sub(int a, int b);
	public int div(int a, int b);
	public static int mul(int a, int b) {
		
		return a*b;
		
	}
	
	public static void getDeveloperInfo() {
		System.out.println("By harshit");
		
		
	}
	
	
	
}
