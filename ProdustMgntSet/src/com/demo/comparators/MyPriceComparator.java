package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Product;

public class MyPriceComparator implements Comparator<Product>{
	
	public int compare(Product o1, Product o2) {
		System.out.println("In price compare"+o1.getPrice()+"--->"+o2.getPrice());
		if(o1.getPrice()<o2.getPrice())
			return -1;
		else if(o1.getPrice()==o2.getPrice()) 
			return 0;
		else
			return 1;
	}
}
