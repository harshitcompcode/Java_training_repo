package com.grayMatter;

public class CounterClass {

	private int count = 0;
	
	
	public void updateCount() {
		
		synchronized (this) {
			count++;
			System.out.println(count);
		}
		
	}
	
	public void printCount() {
		System.out.println(count);
	}
	
	
}
