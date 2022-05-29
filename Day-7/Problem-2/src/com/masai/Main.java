package com.masai;

public class Main {
	
	public static void main(String[] args) {
		
		DayScholar d = new DayScholar();
		Hosteller h = new Hosteller();
		
		double x = d.payFee(1000);
		System.out.println("Total fee for student: "+x);
		
		
		double y = h.payFee(1500);
		System.out.println("Total fee for Hosteller: "+y);
		
		
	}
	
	
}
