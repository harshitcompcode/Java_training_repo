package com.graymatter;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		System.out.println("num=" +num);
		
		boolean flag =false;
		System.out.println(flag);
		
		int num1=8,num2=3;
//		System.out.println("sum="+ (num1+num2));
//		System.out.println("diff="+ (num1-num2));
//		System.out.println("prod="+ (num1*num2));
//		System.out.println("div="+ ((float)num1/num2));
//		System.out.println("rem="+ (num1%num2));
//		
//		
//		int i =8;
//		i++;
		int a = 78,b = 69,c=66;
//		int d = (a>b &&a>c)?a:(b>c?b:c);
//		int e = a>b ? (a>c?a:c):(b>c?b:c);
//		System.out.println(e);
//		
		
		//Max of 4 and 5 numbers using ternary operator
		
		a = a ^ b ^ c; 
        b = a ^ b ^ c; 
        c = a ^ b ^ c; 
        a = a ^ b ^ c;
        System.out.println(a+" "+b+ " "+c);
        
        boolean x = a%2==0 ? true:false;
        
        int i =5,j=3;
       
        int z = 3;
        
        System.out.println(~z);
        
        i = 7;
        float f = i;//widening-- lower range to higher range type
        
        float f1 = 5.6f;
        i = (int)f1;//narrowing, some times there might be data loss
        
        
        
        
        
		
		
		
	}

}
