package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Product;

public class Mynamecomparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
			System.out.println("In name compare"+o1.getName()+"--->"+o2.getName());
			return o1.getName().compareTo(o2.getName());
	
	
	}

}
