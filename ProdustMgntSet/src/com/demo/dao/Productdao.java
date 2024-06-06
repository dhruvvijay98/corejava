package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface Productdao {

	boolean save(Product p);

	Set<Product> findAll();

	Product findById(int pid);

	List<Product> findByName(String nm);

	List<Product> findByPrice(float price);

	boolean deleteById(int id);



	List<Product> arrangeByPrice();

	List<Product> arrangeByName();

	Set<Product> arrangeById();

	boolean updateById(int pid, int qty, float price);


}
