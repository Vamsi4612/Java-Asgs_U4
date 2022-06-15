package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {
	
	void check() {
		
	}
	
	
	double bonus(String jdate) throws InvalidAgeException {
		
		try {
			LocalDate jld = LocalDate.parse(jdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			LocalDate ld = LocalDate.now();
			Period p = Period.between(jld, ld);
			
			int exp = p.getYears();
			
//			System.out.println("Exp : "+exp);
			
			if(exp<=0) {
				System.out.println("Age should not be in the future");
				return 0;
			}
			else if(exp<=1 && exp>0) {
				return 5000;
			}
			else if(exp<=2 && exp>1) {
				return 8000;
			}
			else
				return 10000;
			
		}
		catch(Exception e) {
			InvalidAgeException iae = new InvalidAgeException("Please pass the date in the correct format");
			throw iae;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter joined date dd/MM/yyyy");
		String jdate = sc.next();
		
		EmployeeBonus e = new EmployeeBonus();
		
		try {
			double b = e.bonus(jdate);
			
			System.out.println("Bonus amt is :"+b);
			
		} catch (InvalidAgeException e1) {
			
//			e1.printStackTrace();
			
			System.out.println(e1.getMessage());
		}
		
	}
	
	
}
