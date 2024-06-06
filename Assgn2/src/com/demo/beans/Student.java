package com.demo.beans;

public class Student {
	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks1() {
		return marks1;
	}

	public void setMarks1(double marks1) {
		this.marks1 = marks1;
	}

	public double getMarks2() {
		return marks2;
	}

	public void setMarks2(double marks2) {
		this.marks2 = marks2;
	}

	public double getMarks3() {
		return marks3;
	}

	public void setMarks3(double marks3) {
		this.marks3 = marks3;
	}
	private int studid;
	private String name;
	private double marks1;
	private double marks2;
	private double marks3;
	
	public Student() {
		super();
	}
	
	public Student(int studid, String name, double marks1, double marks2, double marks3) {
		super();
		this.studid = studid;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	@Override
	public String toString() {
		System.out.println("Students Details: ");
		System.out.println("--------------------------");
		System.out.println("");
		return "Student [studid=" + studid  + ", \nname=" + name + ", \nmarks1=" + marks1 + ", \nmarks2=" + marks2
				+ ", \nmarks3=" + marks3 + "]";
	}
	
	

}
