package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface Productdao {

	boolean save(Product p);

	List<Product> findAll();

	Product findbyID(int pid);

	List<Product> findbyName(String nm);

	List<Product> findbyPrice(float price);

	boolean removebyId(int pid);

	boolean modify(int id, String nm1, float price1);

	//List<Product> ArrangebyPrice();

	List<Product> ArrangebyName();

	List<Product> ArrangebyId();


}
