package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.studentService;

public class studentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		Student [] stu = new Student[2];
		System.out.println("Enter Student Details: ");
		studentService.addnewStudent(stu);
		
		do
		{
			System.out.println("Select from menu");
			System.out.println("1.Display student details\n 2.Search by id\n 3.Search ny name\n 4.Calculate GPA\n 5.Exit");
			
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				{
					studentService.DisplayAll(stu);
				}
			break;
			case 2:
				{
					System.out.println("enter id to search");
					int id = sc.nextInt();
					Student obj = studentService.searhById(stu,id);
				}
			break;
			case 3: 
				{
					System.out.println("enter name to search");
					String nm = sc.next();
					Student obj1 = studentService.searchByName(stu,nm);
				}
			break;
			case 4 :
				{
					
					
				//	studentService.calcGpa();
				}
			break;
			case 5:System.out.println("thanks");
			break;
			default: System.out.println("select correct choice");
			break;
			}
		}
		while(ch!=5);
	
		

	}

}
