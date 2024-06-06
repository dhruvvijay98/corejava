package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.FactorialThread;
import com.demo.threads.PrintTableThread;

public class TestMyClass {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		System.out.println("addition : "+ob.add(5, 7));
		
		PrintTableThread pt1=new PrintTableThread(ob,7);
	    pt1.start();
	    PrintTableThread pt2=new PrintTableThread(ob,5);
	    pt2.start();
	    FactorialThread f=new FactorialThread(ob,5);
		f.start();
		
		try {
			pt1.join();
			pt2.join();
			f.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("At the end of main");
	}

}
