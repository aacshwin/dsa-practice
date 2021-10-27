package com.random;

public class MultiThreadingEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hi!");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello!");
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("done");
		
		
	}

}
