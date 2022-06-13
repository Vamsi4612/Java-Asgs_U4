package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	
	
	void checker(String s) throws InvalidAgeException {
		try {
			LocalDate dob = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			LocalDate ld = LocalDate.now();
			
			Period p = Period.between(dob, ld);
			
			int age = p.getYears();
			
			if(age<0) {
				System.out.println("Date of birth should not be in future");
			}
			else if(age>=18 && age!=0) {
				System.out.println("You are eligible to cast your vote");
			}
			else if(age == 0) {
				System.out.println("Happy Birthday, You are eligible to cast your vote.");
			}
		}
		catch(Exception e) {
			InvalidAgeException iae = new InvalidAgeException("please pass the date in the proper format");
			throw iae;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter DOB in format dd/MM/yyyy");
		String dob = sc.next();
		
		Main m = new Main();
		try {
			m.checker(dob);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
