package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	List<Product> productList=new ArrayList<>();
	
	void addProduct(Product product){
		int flag = 0;
		for(Product p : productList) {
			if(p.name.equals(product.name) && p.company.equals(product.company) && p.price == (product.price)) {
				p.count = p.count;
				System.out.println("Count updated Product already exists");
				flag = 1;
			}	
		}
		if(flag ==0) {
		productList.add(product);
		System.out.println("Product added successfully");
		}
		
	}
	List<Product> showAllProduct(){
		
		return productList;
	}
	
	public static void main(String[] args) {
		Ecommerce ecommerce=new Ecommerce();
		ecommerce.addProduct(new Product("Shoes",2000,"Adidas",12));
		ecommerce.addProduct(new Product("Ipad",100000,"Apple",2));
		ecommerce.addProduct(new Product("Ipad",100000,"Apple",4));
		ecommerce.addProduct(new Product("Shoes",4000,"Nike",4));
		ecommerce.addProduct(new Product("Shoes",2000,"Adidas",8));
		System.out.println(ecommerce.showAllProduct());
	}
	
}
