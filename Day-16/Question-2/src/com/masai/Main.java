package com.masai;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Employee> ts = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		int count=1;
		while(count<=4) {
			
			System.out.println("Enter details of employee"+count);
			System.out.println("===========================");
			System.out.println("Enter Employee name");
			String name = sc.next();
			System.out.println("Enter employee id");
			int id = sc.nextInt();
			System.out.println("Enter employee salary");
			Double salary = sc.nextDouble();
			count++;
			ts.add(new Employee(id, name, salary));
		}
		
		
		for(Employee item : ts) {
			System.out.println(item);
		}
		
		
	}

}
