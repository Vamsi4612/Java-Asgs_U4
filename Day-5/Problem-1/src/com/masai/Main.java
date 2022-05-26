package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee details = getEmployeeDetails();
		
		int pf = getPFPercentage();
		
		details.calculateNetSalary(pf);
		
		System.out.println("Id: "+details.getemployeeId());
		System.out.println("Name: "+details.getemployeeName());
		System.out.println("Salary: "+details.getSalary());
		System.out.println("Net Salary: "+details.getnetSalary());
		
	}
	
	public static Employee getEmployeeDetails() {
		Employee details = new Employee();
		
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		
		System.out.println("Enter employeeId:");
		int id = scan.nextInt();
		details.setemployeeId(id);
		
		System.out.println("Enter employeeName");
		String name = scanString.nextLine();
		details.setemployeeName(name);
		
		System.out.println("Enter salary");
		double salary = scan.nextDouble();
		details.setSalary(salary);

		return details;
	}

	public static int getPFPercentage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter pfpercentage");
		int pf = scan.nextInt();
		return pf;
	}

}
