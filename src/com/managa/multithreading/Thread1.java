package com.managa.multithreading;

public class Thread1 extends Thread{
	Table table;
	
	public Thread1(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(10);
	}
}

 class Thread2 extends Thread{
	Table table;
	
	public Thread2(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(5);
	}
}
