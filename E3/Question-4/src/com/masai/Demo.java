package com.masai;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String name = sc.next();
		System.out.println("Enter mobileNumber");
		String num = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		
		Demo d = new Demo();
		if(d.validate(name, num, email, pwd)) {
			Customer c = new Customer();
			c.setEmail(email);
			c.setMobileNumber(num);
			c.setUsername(name);
			c.setPassword(pwd);
			
			System.out.println(c.getUsername());
			System.out.println(c.getMobileNumber());
			System.out.println(c.getEmail());
			System.out.println(c.getPassword());

		}
		else {
			System.out.println("Enter valid details");
		}
		
	}
	
	boolean validate(String name,String num,String email,String pwd){
		if(name.matches("[a-zA-z]") && num.matches("[6789][0-9]{9}") && email.matches("[^a-zA-Z0-9]") && pwd.matches("[^a-zA-Z0-9]")) {
			return true;
		}
		else {
			return false;
		}
	}

}
