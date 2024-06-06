package com.demo.service;

import com.demo.beans.Employee;

public interface EmpService {

	boolean addnewEmployee(int ch);

	Employee[] displayall();

	Employee findById(int id);

	Employee[] findByName(String name);

	

	boolean updateSalById(int id, int salary);

}
