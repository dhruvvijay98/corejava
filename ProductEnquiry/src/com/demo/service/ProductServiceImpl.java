package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.Productdao;
import com.demo.dao.ProductdaoImpl;
import com.demo.beans.Product;

public class ProductServiceImpl implements ProductService{
	private Productdao pdao;

	public ProductServiceImpl() {
		super();
		this.pdao =  new ProductdaoImpl(); 
	}

	@Override
	public boolean addnewproduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String nm = sc.next();
		System.out.println("enter qty");
		int qty = sc.nextInt();
		System.out.println("enter price");
		float price = sc.nextFloat();
		System.out.println("enter expiry in dd/MM/yyyy");
		String dt = sc.next();
		LocalDate ldt= LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p = new Product(id,nm,qty,price,ldt);
		return pdao.save(p);
		
	}

	@Override
	public List<Product> displayAll() {
	
		return pdao.findAll();
	}

	@Override
	public Product displaybyID(int pid) {
		
		return pdao.findbyID(pid);
	}

	@Override
	public List<Product> displayByName(String nm) {
		
		return pdao.findbyName(nm);
	}

	@Override
	public List<Product> searchbyPrice(float price) {
		
		return pdao.findbyPrice(price);
	}

	@Override
	public boolean deletebyID(int pid) {
		
		return pdao.removebyId(pid);
	}

	@Override
	public boolean modifyAll(int id, String nm1, float price1) {
		// TODO Auto-generated method stub
		return pdao.modify(id,nm1,price1);
	}

	@Override
	public List<Product> sortByName() {
		// TODO Auto-generated method stub
		return pdao.ArrangebyName();
	}

	@Override
	public List<Product> sortById() {
		
		return pdao.ArrangebyId();
	}

}
