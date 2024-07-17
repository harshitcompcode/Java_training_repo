package com.GrayMatter;

public class MainSchool {

	public static void main(String[] args) throws Throwable {
		
		
		Student s1 = new Student("Harshit",123);
		Student s2 = new Student("Ben",145);
		Student s3 = new Student("Raj",786);
		Student st[] = {s1,s2,s3};
		
		ClassRoom c = new ClassRoom(7,4,st);
		
	
		System.out.println(c);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		MainSchool mc = new MainSchool();
		
		
		
		
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Manual invoke to finalize");
		System.gc();
	}
	
	
	
	
}
