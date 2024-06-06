package com.demo.enums;

public enum Coffee {
	//small,medium,large;
	small(150,100),medium(250,200),large(350,300);
	private float price,size;

	private Coffee(float price, float size) {
		this.price = price;
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getSize() {
		return size;
	}

	

}
