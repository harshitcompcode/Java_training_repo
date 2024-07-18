package com.grayMatter;

public class demoOnThreads extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in run method");
		
		
		
		for(int i =0;i<=5;i++) {
//		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId()+" "+i);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		System.out.println(currentThread().isAlive());
		System.out.println(currentThread().isDaemon());
		
		
		demoOnThreads dot = new demoOnThreads();
		dot.start();
		
		demoOnThreads dot1 = new demoOnThreads();
		dot1.start();
		
		
		
		

	}

}
