package com.GrayMatter;

public class School {

	String schoolName;
	String address;
	ClassRoom cr[];
	
	
	
	public School() {
		super();
	}



	public School(String schoolName, String address, ClassRoom[] cr) {
		super();
		this.schoolName = schoolName;
		this.address = address;
		ClassRoom c1 = new ClassRoom(3,2);
		ClassRoom c2 = new ClassRoom(5,1);
		
		
		ClassRoom cr1[] = new ClassRoom[2];
		this.cr = cr1;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.gc();
	}
	
	
	
}
