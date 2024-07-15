package com.graymatter;

import java.util.Scanner;

public class Calculator {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a,b;
			char op;
			System.out.print("enter 2 nos ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("enter operator ");
			
			op =sc.next().charAt(0);
			
			
			switch(op) {
			
			case '+':System.out.println(a+b);
			break;
			case '-':System.out.println(a+b);
			break;
			case '*':System.out.println(a+b);
			break;
			case '/':System.out.println(a+b);
			break;
			default:
				System.out.println("Invalid operator");
			
			}
			
		}
}
