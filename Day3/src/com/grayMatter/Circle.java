package com.grayMatter;

public class Circle {

	double radius;
	public static final double pi = 3.14;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void getArea() {
		System.out.println(pi*radius*radius);
		
	}

	public Circle() {
		super();
	}
}
