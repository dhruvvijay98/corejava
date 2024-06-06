package com.demo.test;

import com.demo.enums.Coffee;

public class TestEnum {

	public static void main(String[] args) {
		Coffee c=Coffee.large;
		switch(c) {
		case small:
			System.out.println("you selected small"+c.getPrice()+"--->"+c.getSize());
			break;
		case medium:
			System.out.println("you selected medium"+c.getPrice()+"--->"+c.getSize());
			break;
		case large:
			System.out.println("you selected large"+c.getPrice()+"--->"+c.getSize());
			break;
			
			
		}

	}

}
