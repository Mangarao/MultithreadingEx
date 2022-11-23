package com.managa.multithreading;

public class MyUserThread extends Thread {
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
		
	}
	public static void main(String[] args) {
		MyUserThread myThread1 = new MyUserThread();
		myThread1.setName("Bahubali 1");
		MyUserThread myThread2 = new MyUserThread();
		myThread2.setName("Bahubali 2");
		myThread1.start(); 
		myThread2.start(); 
		
	}

}
