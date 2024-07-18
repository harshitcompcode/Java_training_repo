package com.grayMatter;

public class DemoWrapper {

	public static void main(String[] args) {
		int i = 67;
		Integer iObj = i;
		int j = iObj.intValue();
		
		String sInt = "78";
		Integer i1 = Integer.parseInt(sInt);
		
		String s = i1.toString();
		
		System.out.println(s);
		System.out.println(j);
		
		String str = "Hello";
		Object obj = str;//upcasting child ref to parent
		
		String s1 = (String)obj; //downcasting , parent to child explicit conversion
		
		
		
		
		

	}

}
