package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Student;

public class StudentService {
	
	public static void acceptData(Student[] stuarr)
	{
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < stuarr.length; i++) {
			System.out.println("enter id ");
			int id = sc.nextInt();
			System.out.println("enter name");
			String nm = sc.next();
			System.out.println("enter marks1 ");
			double m1 = sc.nextDouble();
			System.out.println("enter marks2 ");
			double m2 = sc.nextDouble();
			System.out.println("enter marks3 ");
			double m3 = sc.nextDouble();
			
			stuarr[i] = new Student(id,nm,m1,m2,m3);
			
			
		}
		sc.close();
		 
	}
	public static void displayData(Student[] stuarr)
	{
		for(int i = 0;i<stuarr.length;i++) {
			System.out.println(stuarr[i]);
		}
		
		
	}
	

}
