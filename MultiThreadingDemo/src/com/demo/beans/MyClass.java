package com.demo.beans;

public class MyClass {
	public int add(int x,int y) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x+y;
	}
	public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n +" * "+ i+" = "+(n*i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int factorial(int n) {
		var f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return f;
	}

}
