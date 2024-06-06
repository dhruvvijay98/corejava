package com.demo.beans;

public class Student {
	private int id;
	private String name;
	private float marks1;
	private float marks2;
	private float marks3;
	
	
	public Student() {
		super();
	}

	public Student(int id, String name, float marks1, float marks2, float marks3) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks1() {
		return marks1;
	}

	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}

	public float getMarks2() {
		return marks2;
	}

	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}

	public float getMarks3() {
		return marks3;
	}

	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3="
				+ marks3 + "]";
	}
	//public double calculateGpa() {
		
//	}
	
	@Override
	public boolean equals(Object obj) {
		Student other = ((Student)obj);
		System.out.println("if Student equals method"+this.name+"--->"+other.name);
		return this.name==other.name;
	}
	public void calcgpa(Student[] stu)
	{
		double gpa=(0.33)*marks1+(0.5)*marks2+(0.25)*marks3;
		System.out.println(gpa);
	}

	
}