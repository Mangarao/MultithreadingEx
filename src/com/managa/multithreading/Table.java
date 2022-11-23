package com.managa.multithreading;

public class Table {
	
	public  void printTable(int num) {
		System.out.println("Print table started");
		synchronized (this) {
			for (int i = 1; i <=10; i++) {
				System.out.println(num+" * "+ i+"="+(num*i));
			}
		}
	
		
		System.out.println("Print table ended");
	}

}
