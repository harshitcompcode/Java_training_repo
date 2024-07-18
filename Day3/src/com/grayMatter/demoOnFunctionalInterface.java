package com.grayMatter;

public class demoOnFunctionalInterface implements MyFunctionalInterface {
	
	
	
	public static void main(String[] args) {
		
		demoOnFunctionalInterface dof = new demoOnFunctionalInterface();
		System.out.println(dof.cubeOfNum(7));
		
		MyFunctionalInterface mf = dof;
		System.out.println(mf.cubeOfNum(6));
		
	}

	@Override
	public double cubeOfNum(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

}
