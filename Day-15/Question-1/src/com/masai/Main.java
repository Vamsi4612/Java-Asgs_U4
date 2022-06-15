package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	
	public int checker(String dob) throws InvalidDateFormat {
		
		try {
			
			LocalDate db = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			LocalDate ld = LocalDate.now();
			
			Period p = Period.between(db, ld);
			
			int age = p.getYears();
			
			return age;
			
		} catch (Exception e) {
			
			InvalidDateFormat idf = new InvalidDateFormat("Invalid Date Entered");
			throw idf;
			
		}
	}
	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of birth dd-MM-yyyy");
		String dob = sc.next();
		
		Main m = new Main();
		
		try {
			
			int age = m.checker(dob);
			
			if(age>0) {
				System.out.println("Your Age is : "+age);
			}
			else {
				System.out.println("Date should not be in Future");
			}
			
		} catch (InvalidDateFormat e) {
			
			System.out.println(e.getMessage());
			
		}
		
		

		

	}

}
