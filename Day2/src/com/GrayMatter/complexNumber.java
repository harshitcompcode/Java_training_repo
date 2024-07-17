package com.GrayMatter;





public class complexNumber {

	public void add(Complex c1, Complex c2) {
		Complex c3 = new Complex();
		c3.imag = c1.imag + c2.imag;
		c3.real = c1.real + c2.real;
		System.out.println(c3.real+" i"+c3.imag);
	}
	
	
	public static void main(String[] args) {
		Complex c1 = new Complex(5,3);
		Complex c2 = new Complex(2,6);
		complexNumber c = new complexNumber();
		
		c.add(c1, c2);
		
	}
	
	
}
