package com.grayMatter;

public class MainChape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s = new Square(5.0);
//		s.getArea();
		
		
//		CalculatorInterface c =new MyCalculator();
//		c.add(5, 7);
//		
//		MyScientificCalculator mc = new MyCalculator();
//		System.out.println(mc.power(6, 3));
		
		display mc = new display();
		mc.display();
		I1 x = mc;
		x.display();
		
		MyScientificCalculator.getDeveloperInfo();
		
		//calling from object not possible
		
		
		
		
	}
	
	

}
