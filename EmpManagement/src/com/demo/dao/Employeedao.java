package com.demo.dao;

import com.demo.beans.*;
public interface Employeedao {
	
	boolean save (Employee e);
	Employee[] findAll();
	Employee getById(int id);

	Employee[] getByName(String name);

	boolean modifySalById(int id, int salary);


}
