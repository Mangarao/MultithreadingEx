package com.managa.multithreading;

public class MyThread implements Runnable  {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			//running
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
		
	}
	//Thread priority 1 to 10
	//
	
	public static void main(String[] args) throws InterruptedException {
		MyThread m1 = new MyThread();
		Thread t1 =  new Thread(m1); //New state
		System.out.println("Thread id: "+t1.getId());
		System.out.println("state of the thread: "+t1.getState());
		t1.setPriority(9);
		System.out.println("t1 priority: "+t1.getPriority());
		MyThread m2 = new MyThread();
		Thread t2 =  new Thread(m2);
		t2.setPriority(1);
		System.out.println("t2 priority: "+t2.getPriority());
		t1.start(); //runnable state - ready but not running
		t1.join(); //Keeps current thread waiting until other threads execution completes
		t2.start();
		
	}

}
