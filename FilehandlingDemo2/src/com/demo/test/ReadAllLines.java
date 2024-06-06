package com.demo.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadAllLines {

	public static void main(String[] args) {
		//to read all lines
		try(BufferedReader br=new BufferedReader(new FileReader("empcsv.txt"));) {
			List<String> lst=br.lines().collect(Collectors.toList());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Path p=Paths.get("empcsv.txt");
		    List<String> lst1=Files.readAllLines(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
