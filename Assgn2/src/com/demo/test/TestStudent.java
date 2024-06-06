package com.demo.test;

import com.demo.beans.Student;
import com.demo.service.StudentService;

public class TestStudent {

	public static void main(String[] args) {
		Student[] stuarr = new Student[2];
		
		StudentService.acceptData(stuarr);
		StudentService.displayData(stuarr);

	}

}
