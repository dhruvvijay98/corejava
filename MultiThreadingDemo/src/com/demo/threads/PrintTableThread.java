package com.demo.threads;

import com.demo.beans.MyClass;
public class PrintTableThread extends Thread{
	private MyClass ob;
	private int n;
	
	
	public PrintTableThread(MyClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}



	public void run() {
		System.out.println("Print table Thread name : "+n+"--->"+Thread.currentThread().getName());
		System.out.println("Print table Thread id: "+n+"--->"+Thread.currentThread().getId());
		ob.printTable(n);
	}

}
