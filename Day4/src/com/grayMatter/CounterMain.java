package com.grayMatter;

public class CounterMain extends Thread {
	
	
	CounterClass cc;
	
	@Override
	public void run() {
		
		
		for(int i =1;i<=10;i++) {
		
		cc.updateCount();
		
		try {
			sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		}
		
	}
   
	
	
	public CounterMain() {
		super();
	}


	public CounterMain(CounterClass cc) {
		super();
		this.cc = cc;
	}


	public static void main(String[] args) {
		
		CounterClass cc = new CounterClass();
		CounterMain cm1 = new CounterMain(cc);
		CounterMain cm2 = new CounterMain(cc);
		
		cm1.start();
		cm2.start();

	}

}
