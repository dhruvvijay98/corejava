package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Product;

public class MyComPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		System.out.println("In price compare"+o1.getPrice()+"--->"+o2.getPrice());
		if(o1.getPrice()<o2.getPrice())
			return -1;
		else if(o1.getPrice()==o2.getPrice()) 
			return 0;
		else
			return 1;
		//return (int)(o1.getPrice()-o2.getPrice());
	
	}

}
