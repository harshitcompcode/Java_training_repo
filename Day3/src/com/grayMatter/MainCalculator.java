package com.grayMatter;

public class MainCalculator {

	public static void main(String[] args) {
		
		ScientificCalculator sc = new ScientificCalculator();
		sc.mul(6,3);
		ArithmeticCalculator ac = new ScientificCalculator();
		ac.add(5,8);
		
		

	}

}
