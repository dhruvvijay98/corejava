package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee{

	
	private int hrscharges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int id, String name, String mobileno,String dept, String desg, LocalDate doj, int hrscharges) {
		super(id,name,mobileno,dept,desg,doj);
		
		this.hrscharges = hrscharges;
	}
	
	public int getHrscharges() {
		return hrscharges;
	}
	public void setHrscharges(int hrscharges) {
		this.hrscharges = hrscharges;
	}
	public double CalNetSalary(){
		return hrscharges ;
	}
	@Override
	public String toString() {
		return super.toString()+ "ContractEmp [ hrscharges=" + hrscharges + "]";
	}
	
	
	
}
