package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Product> al = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		while(count<4) {
			System.out.println("Enter Product name");
			String name = sc.next();
			System.out.println("Enter Product id");
			int id = sc.nextInt();
			System.out.println("Enter Product price");
			Double price = sc.nextDouble();
			count++;
			al.add(new Product(id, name, price));
//			al.add(new Product(15,"bat",5000));
//			al.add(new Product(12,"ball",2000));
//			al.add(new Product(18,"tv",10000));
//			al.add(new Product(19,"pen",10));
		}
		
		
		System.out.println("Enter 1 to sort using price");
		System.out.println("Enter 2 to sort using name");
		System.out.println("Enter 3 to sort using id");
		int n = sc.nextInt();
		
		
		if(n==1) {
			Collections .sort(al,new SortPrice());
		}
		else if(n==2) {
			Collections .sort(al,new SortName());
		}
		else{
			Collections .sort(al,new SortId());
		}
		
	
		for(Product item : al ) {
			System.out.println(item);
		}
		
		
	}

}
