package com.grayMatter;

public class DemoOnExceptions {
	
	
	public static void doDiv(int a ,int b) {
		if(b==0)
			throw new ArithmeticException();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num =7,deno [] = {1,4,6,2};
//		String s = null;
//		try {
//			for(int i =0;i<4;i++) {
//				if(deno[i]==0)
//				throw new ArithmeticException();
//			System.out.println(num/deno[i]);
//			}
//			System.out.println(s.charAt(0));
//		}
//		catch(ArithmeticException ae){
//			ae.printStackTrace();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("finally block reached");
//		}
//		
//		
//		
//	
		try {
			doDiv(5,0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		
	System.out.println("End of main block");
//		
		
		
		
	}

}
