package com.grayMatter;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class demoOnStrings {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		System.out.println(s1.hashCode());
		
		String s2 = "halo";
		
		String s = s2;
		
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());

		s = "    halo ";
		System.out.println(s.length());
		
		s= "apple";
		s1 = "Apple";
		System.out.println(s1.compareTo(s));
		
		
		
//		StringBuffer sbf = new StringBuffer();
//		StringBuffer sbf1 = new StringBuffer("Harshit");
//		System.out.println(sbf1.hashCode());
//		sbf.append("Harshit");
//		System.out.println(sbf.hashCode());
		
		
		List<String> list = new ArrayList<>();
		list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Sugar");
        list.add("Sweet");
        list.add("Cherry");
        for(String i : list) {
        	if(i.startsWith("S"))
        		System.out.println(i);
        }
        String a = "Hello this is GrayMAtter Company";
        String sar[] =a.split(a);
        
        
        
        StringTokenizer tokenizer = new StringTokenizer(a," ");
        while(tokenizer.hasMoreElements())
        	System.out.println(tokenizer.nextToken());
        
        
        StringJoiner sjoiner = new StringJoiner(",");
        sjoiner.add("apple");
        sjoiner.add("ball");
        sjoiner.add("wicket");
        sjoiner.add("ball");
        sjoiner.add("apple");
        sjoiner.add("ball");
        
        System.out.println(sjoiner);
        
        
        
        
		
		
		
		
	}

}
