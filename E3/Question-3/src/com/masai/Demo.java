package com.masai;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m) {
		
		if(m.equals(Month.JAN)) {
			System.out.println("This is the 1st Month of the Year January");
		}
		if(m.equals(Month.FEB)) {
			System.out.println("This is the 1st Month of the Year Feburary");
		}
		if(m.equals(Month.MAR)) {
			System.out.println("This is the 1st Month of the Year March");
		}
		if(m.equals(Month.APR)) {
			System.out.println("This is the 1st Month of the Year April");
		}
		if(m.equals(Month.MAY)) {
			System.out.println("This is the 1st Month of the Year May");
		}
		if(m.equals(Month.JUN)) {
			System.out.println("This is the 1st Month of the Year June");
		}
		if(m.equals(Month.JULY)) {
			System.out.println("This is the 1st Month of the Year July");
		}
		if(m.equals(Month.AUG)) {
			System.out.println("This is the 1st Month of the Year August");
		}
		if(m.equals(Month.SEP)) {
			System.out.println("This is the 1st Month of the Year September");
		}
		if(m.equals(Month.OCT)) {
			System.out.println("This is the 1st Month of the Year October");
		}
		if(m.equals(Month.NOV)) {
			System.out.println("This is the 1st Month of the Year November");
		}
		if(m.equals(Month.DEC)) {
			System.out.println("This is the 1st Month of the Year December");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month ");
		String mon = sc.next();
		Month m = Month.valueOf(mon);
		Demo d = new Demo();
		d.showDetails(m);
		}
		catch(Exception e) {
			System.out.println("Invalid Month Name");
		}
	}
	
	
}
