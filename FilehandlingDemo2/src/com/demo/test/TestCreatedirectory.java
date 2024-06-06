package com.demo.test;

import java.io.File;

public class TestCreatedirectory {

	public static void main(String[] args) {
		File f=new File("mydata");
		f.mkdir();
	}

}
