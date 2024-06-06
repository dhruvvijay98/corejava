package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Product;

import com.demo.dao.Productdao;
import com.demo.dao.ProductdaoImpl;

public class ProductServiceImpl implements ProductService{

	private Productdao pdao;
	
	public ProductServiceImpl() {
		super();
		pdao = new ProductdaoImpl();
	}

	@Override
	public boolean addNewProduct() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pid");
		int pid = sc.nextInt();
		System.out.println("Enter Product Name");
		String nm = sc.next();
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		System.out.println("Enter Price");
		float price = sc.nextFloat();
		System.out.println("Enter Expiry Date in format (dd/MM/yyyy)");
		String expdt = sc.next();
		LocalDate ldt = LocalDate.parse(expdt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Product p = new Product(pid, nm, qty, ldt);
		
		return pdao.save(p);
	
	}

	@Override
	public Set<Product> displayAll() {
		
		return pdao.findAll();
	}

	@Override
	public Product displayById(int pid) {
		
		return pdao.findById(pid);
	}

	@Override
	public List<Product> displayByName(String nm) {
		
		return pdao.findByName(nm);
	}

	@Override
	public List<Product> displayByPrice(float price) {
		
		return pdao.findByPrice(price);
	}

	@Override
	public boolean removeById(int id) {
		
		return pdao.deleteById(id);
	}

	

	@Override
	public List<Product> sortByPrice() {
		return pdao.arrangeByPrice();
	}

	@Override
	public List<Product> sortByName() {
		return pdao.arrangeByName();
	}

	@Override
	public Set<Product> sortById() {
		
		
		return pdao.arrangeById();
	}

	@Override
	public boolean modifyById(int pid, int qty, float price) {
		// TODO Auto-generated method stub
		return pdao.updateById(pid,qty,price);
	
	}
	
	
	
	

}
