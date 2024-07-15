package com.graymatter;

public class studentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 = new Student();
		System.out.println(st1);
		st1.setStudName("harsh");
		st1.setId(123);
		st1.setN1(10);
		st1.setN2(20);
		st1.setN3(30);
		
		System.out.println(st1);
		System.out.println("using getters");
		System.out.println(st1.getId());
		System.out.println(st1.getStudName());
		System.out.println(st1.getN1());
		System.out.println(st1.getN2());
		System.out.println(st1.getN3());
		
		Student st2 = new Student("Harshit",123,54,67,67);
		System.out.println(st2);

	}

}
