package com.grayMatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class DemoOnArray {
	static Scanner sc = new Scanner(System.in);
	public static boolean isPrime (int n) {
		for(int i =2;i<Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
	}
public static int bs(int arr[],int k) {
	int l = 0;
	int h = arr.length;
	while(l<h) {
		int m = l + (h-l)/2;
		
		if(arr[m]==k)return m;
		else if(arr[m]<k)l = m+1;
		else h = m-1;
	}
	
	return -1;
}
public static void insert(int arr[],int k,int n) {
	int arr1[] = new int[arr.length+arr.length/2];
	
	if(arr[arr.length-1]!=0)
	for(int i =0;i<arr1.length;i++) {
		if(i<k)arr1[i]=arr[i];
		else if(i==k)arr1[i]=n;
		else arr1[i] =arr[i-1];
	}
	else {
		for(int i =k+1;i<arr.length;i++) {
			arr[i]= arr[i-1];
		}
		arr[k] = n;
		
	}
	
	
	
}
	public static void delete(int arr[],int k) {
		int i =0;
		
		while(arr[i]!=-1) {
			arr[i] = arr[i+1];
			i++;
		}
		
		
		arr[arr.length-1]= -1;
	}
	public static void sort(int arr[]) {
		
		
		for(int i =0;i<arr.length-1;i++)
			for(int j =0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {b
					int x = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = x;
				}
			}
	}



	public static void main(String[] args) {
		
//		int arr[] = new int[10];
//		Arrays.fill(arr,-1);
//		
//		
//		
//		for(int i =0;i<10;i++) {
//			int y = sc.nextInt();
//			arr[i] = y;
//		}
//		int s =0;
////		sort(arr);
//		for(int i =0;i<10;i++) {
////			s += arr[i];
////			if(isPrime(arr[i]))
//			System.out.println(arr[i]);
//		}
//		System.out.println("\n");
//		delete(arr,4);
//		for(int i =0;i<10;i++) {
////			s += arr[i];
////			if(isPrime(arr[i]))
//			System.out.println(arr[i]);
//		}
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++) {   
			for(int j=0;j<3;j++) {  
			c[i][j]=0;      
			for(int k=0;k<3;k++)          
			c[i][j]+=a[i][k]*b[k][j];     
			}
		}
			for(int i=0;i<3;i++) {   
				for(int j=0;j<3;j++) 
					System.out.print(c[i][j]+" ");
		System.out.println("\n");
			}
		
		
		
//		System.out.println("index"+bs(arr,5));
		
		//find duplicates
		
		//insert element at a given position
		//delete at given position
		
		
		
//		int x = arr[2];
//		int c =0;
//		for(int i =0;i<arr.length;i++) {
//			if(arr[i]==x)c++;
//		}
//		
		
		
		

	}

}
