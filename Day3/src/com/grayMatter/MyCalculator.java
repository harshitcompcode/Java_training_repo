package com.grayMatter;

public class MyCalculator implements MyScientificCalculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	

	

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double power(int a, int b) {
		// TODO Auto-generated method stub
		return Math.pow(a, b);
		
	}

	@Override
	public double squareRoot(int a) {
		return Math.sqrt(a);
		// TODO Auto-generated method stub
		
	}



	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
