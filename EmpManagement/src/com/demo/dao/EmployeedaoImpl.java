package com.demo.dao;

import com.demo.beans.Employee;
import com.demo.beans.Person;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.beans.ContractEmp;
import com.demo.beans.SalariedEmp;


public class EmployeedaoImpl implements Employeedao {
	
	static Employee[] emparr;
	static int cnt = 0;
	static {
		emparr = new Employee[10];
		 emparr[0]=new SalariedEmp(1,"Rajan","222","gaming","developer",LocalDate.of(2020, 02, 02),777777);
    	 emparr[1]=new ContractEmp(2,"Rajan","4444","UX","manager",LocalDate.of(1998, 02, 02),8000);
    	 emparr[2]=new SalariedEmp(3,"Manjiri","222","gaming","manager",LocalDate.of(2020, 02, 02),565656);
    	 cnt=3;
	}
	@Override
	public boolean save(Employee e) {
		if(cnt<emparr.length) {
			emparr[cnt]=e;
			cnt++;
			return true;
		}else {
			System.out.println("Array Full");
			return false;
		}
	}
	@Override
	public Employee[] findAll() {
		
		return emparr;
	}
	@Override
	public Employee getById(int id) {
		Optional<Employee> e = Stream.of(emparr).filter(ob->ob.getId()==id)
				.findFirst();
		if(e.isPresent())
			return e.get();		
		return null;
	}
	@Override
	public Employee[] getByName(String name) {
	 Stream.of(emparr).filter(ob->ob.getName().equals(name)).collect(Collectors.toList());
	 
		
		return null;
	}
	
	@Override
	public boolean modifySalById(int id, int salary) {
		// TODO Auto-generated method stub
		Employee e = getById(id);
		System.out.println(e);
		if(e!=null) {
			if(e instanceof SalariedEmp)
				((SalariedEmp)e).setSalary(salary);
			else if(e instanceof ContractEmp) {
				
				((ContractEmp)e).setHrscharges(salary);
			}
			return true;
		}
		return false;
		}
}
