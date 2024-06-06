package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
	private int pid;
	private String Name;
	private float price;
	private LocalDate expt;
	public Product() {
		super();
	}
	public Product(int pid, String name, float price, LocalDate expt) {
		super();
		this.pid = pid;
		Name = name;
		this.price = price;
		this.expt = expt;
	}
	public Product(int id) {
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDate getExpt() {
		return expt;
	}
	public void setExpt(LocalDate expt) {
		this.expt = expt;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", Name=" + Name + ", price=" + price + ", expt=" + expt + "]";
	}
	@Override
	public int hashCode() {
		return pid;
	}
	@Override
	public boolean equals(Object obj) {
		Product other = ((Product)obj);
		System.out.println("product equals"+this.pid+"----->"+other.pid);
		return this.pid==other.pid;
	}
	public int compareTo(Product o) {
		System.out.println("in compare to"+this.Name+"---->"+o.Name);
		return this.Name.compareTo(o.Name);
	}
	public Object getPname() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setQty(int qty) {
		// TODO Auto-generated method stub
		
	}
	

	
}
