package com.graymatter;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// QUESTION 1: Maximum of 4 numbers using ternary operator
		
			System.out.println("QUESTION 1: Maximum of 4 numbers using ternary operator");
	        int num1 = 10;
	        int num2 = 20;
	        int num3 = 30;
	        int num4 = 40;

	        // Find the largest number using nested ternary operators
	        int largest = (num1 > num2) ? ((num1 > num3) ? ((num1 > num4) ? num1 : num4) : (num3 > num4) ? num3 : num4) : ((num2 > num3) ? ((num2 > num4) ? num2 : num4) : ((num3 > num4) ? num3 : num4));

	        // Print the largest number
	        System.out.println("The largest number is: " + largest);
	        
	        
	        
	    // QUESTION 2:  Write a program to swap 4 numbers without using temporary variable
	        
	        System.out.println("QUESTION 2: Write a program to swap 4 numbers without using temporary variable");
	        
	        int a = 5;
	        int b = 10;
	        int c = 15;
	        int d = 20;
	 
	        a = a + b + c + d; // Step 1: Sum all numbers into 'a'
	        b = a - (b + c + d); // Step 2: Subtract sum of other three numbers from 'a' to get 'b'
	        c = a - (b + c + d); // Step 3: Subtract sum of 'b', 'c', and 'd' from 'a' to get 'c'
	        d = a - (b + c + d); // Step 4: Subtract sum of 'b', 'c', and 'd' from 'a' to get 'd'
	        a = a - (b + c + d);

	        System.out.println("After swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("c = " + c);
	        System.out.println("d = " + d);
	        
	        
	        
	        
	    //  QUESTION 2: Write a program to swap 5 numbers without using temporary variable
	        
	        System.out.println("QUESTION 3: Write a program to swap 5 numbers without using temporary variable");
	        
	        int aa = 1, bb = 2, cc = 3, dd = 4, ee = 5;
	        
	        aa = aa + bb + cc + dd + ee;
	        bb = aa - (bb + cc + dd + ee);
	        cc = aa - (bb + cc + dd + ee);
	        dd = aa - (bb + cc + dd + ee);
	        ee = aa - (bb + cc + dd + ee);
	        aa = aa - (bb + cc + dd + ee);

	        System.out.println("\nAfter swapping:");
	        System.out.println("aa = " + aa + ", bb = " + bb + ", cc = " + cc + ", dd = " + dd + ", ee = " + ee);
	        
	    //  QUESTION 4: Max of 3 numbers using if statement
	        
	        System.out.println("QUESTION 4: Max of 3 numbers using if statement");
	        if(a>b)
	        {
	        	if(a>c)
	        		System.out.println("a is the greatest.");
	        	else
	        		System.out.println("C is the greatest.");
	        }
	        else if (b>a)
	        {
	        	if(b>c)
	        		System.out.println("b is the greatest.");
	        	else
	        		System.out.println("c is the greatest.");
	        }   
	
	      // QUESTION 6: Number to word. For example: 1= One, 2= Two (till 10).
	        
	        System.out.println("QUESTION 6: Number to word. For example: 1= One, 2= Two (till 10).");
	        
	        System.out.println("Enter a number between 1 to 10: ");
	        
	        int number = sc.nextInt();
	        
	        switch(number) {
	        	case 1:
	        		System.out.println("One");
	        		break;
	        	case 2:
	        		System.out.println("Two");
	        		break;
	        	case 3:
	        		System.out.println("Three");
	        		break;
	        	case 4:
	        		System.out.println("Four");
	        		break;
	        	case 5:
	        		System.out.println("Five");
	        		break;
	        	case 6:
	        		System.out.println("Six");
	        		break;
	        	case 7:
	        		System.out.println("Seven");
	        		break;
	        	case 8:
	        		System.out.println("Eight");
	        		break;
	        	case 9:
	        		System.out.println("Nine");
	        		break;
	        	case 10:
	        		System.out.println("Ten");
	        		break;
	        	default:
	        		System.out.println("Invalid input!");
	        }		
	        
	        
	        
	    }		
}


