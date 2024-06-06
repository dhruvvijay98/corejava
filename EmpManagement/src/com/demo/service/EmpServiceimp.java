package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.ContractEmp;
import com.demo.dao.Employeedao;
import com.demo.dao.EmployeedaoImpl;
import java.util.Scanner;
public class EmpServiceimp implements EmpService{
	
	private Employeedao edao;
	
	
	

	public EmpServiceimp() {
		super();
		this.edao = new EmployeedaoImpl();
	}

	
	@Override
	public boolean addnewEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter mobileno");
		String mobileno = sc.next();
		System.out.println("enter dept");
		String dept = sc.next();
		
		System.out.println("enter desg");
		String desg = sc.next();
		System.out.println("enter date in dd/MM/yyyy format");
		String dt = sc.next();
		LocalDate doj = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = null;
		switch(ch) {
		case 1: System.out.println("enter salary");
		int salary = sc.nextInt();
		e = new SalariedEmp(id,name,mobileno,dept,desg,doj,salary);
		case 2: System.out.println("enter hrscharges");
		int hrscharges = sc.nextInt();
		e = new ContractEmp(id,name,mobileno,dept,desg,doj,hrscharges);
		}
		return false;
	}

	@Override
	public Employee[] displayall() {
		
		return edao.findAll();
	}

	@Override
	public Employee findById(int id) {
	
		return edao.getById(id);
	}

	@Override
	public Employee[] findByName(String name) {
		return edao.getByName(name);
	}

	@Override
	public boolean updateSalById(int id, int salary) {
		return edao.modifySalById(id,salary);
	}
	
	

}
