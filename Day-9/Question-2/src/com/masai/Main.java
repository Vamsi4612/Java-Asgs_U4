package com.masai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		if(num>=1 && num<=10) {
			Parent p = new Child(num);
			p.method1();
			p.method2();
			p.method3();
			Child c = (Child) p;
			c.method4();
		}
		else {
			System.out.println("Invalid number");
		}
	}
}
