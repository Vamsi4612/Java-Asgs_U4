package com.masai;

public class Product {
	
	
	String name;
	String company;
	double price;
	int count;
	
	public Product(String name, double price, String company, int count) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", company=" + company + ", price=" + price + ", count=" + count + "]";
	}
	
}
