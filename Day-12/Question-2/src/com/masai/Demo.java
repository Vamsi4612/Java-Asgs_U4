package com.masai;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Aadhar Number");
		String aadhar = sc.next();
		System.out.println("Enter Mobile Number");
		String num = sc.next();
		
		Demo  d1 = new Demo();
		if(d1.validate(name, num, aadhar)) {
			Citizen c = new Citizen();
			c.setAadharNumber(aadhar);
			c.setMobileNumber(num);
			c.setName(name);
			
			System.out.println(c.getName());
			System.out.println(c.getMobileNumber());
			System.out.println(c.getAadharNumber());
			
		}
		else System.out.println("Invalid Details");
		
	}
	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(name.matches("[a-zA-Z]{3,8}") && mobileNum.matches("[6789]{1}[0-9]{9}") && aadharCard.matches("[0-9]{12}") ) {
			return true;
		}
		else return false;
	}
	
}
