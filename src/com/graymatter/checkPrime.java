package com.graymatter;

import java.util.Scanner;

public class checkPrime {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	
	boolean f = false;
//	while(i<=Math.sqrt(num)) {
//		if(num%i==0) {
//			
//			f = true;
//			break;
//		}
//		else {
//			i++;
//		}
//		
//	}
//	if(f)
//		System.out.println("Not prime");
//	else
//		System.out.println("Prime");
	for(int i =1;i<=50;i++) {
		if(i%3==0)continue;
		System.out.println(num +"*"+i+"="+(num*i));
	}
	
	
	
	}
}
