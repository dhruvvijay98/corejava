package com.demo.beans;

import java.time.LocalDate;

public class SalariedEmp extends Employee {
	
	private int salary;
	
	
	public SalariedEmp(int id, String name, String mobileno,String dept, String desg, LocalDate doj,int salary) {
		super(id,name,mobileno,dept,desg,doj);
		this.salary = salary;
		
	}

	public SalariedEmp() {
		super();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	

	public double CalNetSalary(){
		return salary  + 0.1*salary + 0.15 *salary + 0.8 *salary ;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [salary=" + salary + "]";
	}
	
	
	

	
}
