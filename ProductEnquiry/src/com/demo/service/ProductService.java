package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	public boolean addnewproduct();

	public List<Product> displayAll();

	public Product displaybyID(int pid);

	public List<Product> displayByName(String nm);

	public List<Product> searchbyPrice(float price);



	public boolean deletebyID(int pid);

	public boolean modifyAll(int id, String nm1, float price1);

	//public List<Product> sortByPrice();

	public List<Product> sortByName();

	public List<Product> sortById();



}
