package com.masai;

import java.util.Scanner;

public class Demo {
	
	
	public static Bank getBank(String bank) {
		String y  = bank;
		if(y.equals("Axis") == true) {
		AxisBank x = new AxisBank("Axis Bank Hyderabad","1234",6);
		return x;
		}
		else if(y.equals("icici") == true || y.equals("ICICI") == true) {
			ICICIBank x = new ICICIBank("ICICI Bank Bengalore","4321",7);
			return x;
		}
		else return null;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter bank: ");
		String x = scan.nextLine();
		
		Bank details = getBank(x);
		
//		System.out.println(details);
		
		if(x.equals("Axis") == true) {
			
			details.displayDetails();
			
			AxisBank a = (AxisBank) details;
			System.out.println(" ");
			a.getCreditCard();
		}
		else if(x.equals("icici") == true || x.equals("ICICI") == true) {
			
			details.displayDetails();
			
		}
		
	}
	
}
