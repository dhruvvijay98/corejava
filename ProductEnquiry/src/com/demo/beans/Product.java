package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Product implements Comparable<Product> {

	private int pid;
	private String pname;
	private int qty;
	private float price;
	private LocalDate exdt;
	
	public Product() {
		super();
	}

	public Product(int pid, String pname, int qty, float price, LocalDate exdt) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.exdt = exdt;
	}

	public Product(int pid) {
		super();
		this.pid = pid;
	}

	public int getId() {
		return pid;
	}

	public void setId(int id) {
		this.pid = id;
	}

	public String getName() {
		return pname;
	}

	public void setName(String name) {
		this.pname = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getExdt() {
		return exdt;
	}

	public void setExdt(LocalDate exdt) {
		this.exdt = exdt;
	}

	@Override
	public String toString() {
		return "Product [id=" + pid + ", name=" + pname + ", qty=" + qty + ", price=" + price + ", exdt=" + exdt + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		Product other = ((Product)obj);
		System.out.println("if Product equals method"+this.pid+"------>"+other.pid);
		return this.pid==other.pid;
	}
	
	@Override
	public int compareTo(Product o) {
		System.out.println("In compareTo"+this.pid+"--->"+o.pid);
		if(this.pid<o.pid) 
			return -1;
		else if (this.pid==o.pid)
			  return 0;
		else 
			return 1;
		//return this.qty-o.qty;
		//return this.pid-o.pid; 
		//return this.pname.compareTo(o.pname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exdt, pid, pname, price, qty);
	}

	
	
	}
	


