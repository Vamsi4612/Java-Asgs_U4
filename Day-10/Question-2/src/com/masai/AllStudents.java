package com.masai;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		System.out.println("Name of the student");
		String n = scString.nextLine();
		System.out.println("Enter address ");
		String add = scString.nextLine();
		
		System.out.println("Enter physics marks; ");
		int a = sc.nextInt();
		System.out.println("Enter chemistry marks: ");
		int b = sc.nextInt();
		System.out.println("Enter maths marks: ");
		int c = sc.nextInt();
		
		Student s1 = new ScienceStudent(a,b,c);
		s1.name = n;
		s1.address = add;
		double result = s1.getPercentage();
		System.out.println("Science Student percentage"+result+"%");
		
		System.out.println("Name of the student");
		String n1 = scString.nextLine();
		System.out.println("Enter address ");
		String add1 = scString.nextLine();
		
		System.out.println("Enter history marks; ");
		int d = sc.nextInt();
		System.out.println("Enter civics marks: ");
		int e = sc.nextInt();
		
		Student s2 = new HistoryStudent(d,e);
		s1.name = n1;
		s2.address = add1;
		double result1 = s2.getPercentage();
		System.out.println("History Student percentage"+result1+"%");
		
		
	}

}
