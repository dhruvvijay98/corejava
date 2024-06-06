package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Student;

import com.demo.beans.Student;

public class studentService {
	
	
	public static void addnewStudent(Student[] stu)
	{
		Scanner sc = new Scanner(System.in);
		
	
	for(int i=0;i<stu.length;i++)
	{
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter marks 1");
		float m1 = sc.nextFloat();
		System.out.println("enter marks 2");
		float m2 = sc.nextFloat();
		System.out.println("enter marks 3");
		float m3 = sc.nextFloat();
		
		stu[i] = new Student(id,name,m1,m2,m3);
		
	}
	}
	public static void DisplayAll(Student[] stu) {
		for(int i=0;i<stu.length;i++)
		{
			System.out.println(stu [i]);
			
		}
		
	}
	public static Student searhById(Student[] stu, int id) {
		for(Student s:stu)
		{
			if(s.getId()==id)
			{
				System.out.println(s);
			}
		}
		return null;
		
		
	}
	public static Student searchByName(Student[] stu, String nm) {
		for(Student s:stu)
		{
			if(s.getName().equals(nm));
			{
				System.out.println(s);;
			}
		}
		return null;
		
		
	}

	public static void calculateAll(Student[] stu, int id) {
		Student s1 = new Student();
		s1.calcgpa(stu);

		
	}
	
	


}
