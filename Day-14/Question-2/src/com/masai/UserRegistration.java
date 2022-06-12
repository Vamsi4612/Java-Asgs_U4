package com.masai;

import java.util.Scanner;

public class UserRegistration {
	
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter your Country");
		String cty = sc.next();
		
		UserRegistration u = new UserRegistration();
		try {
			u.registerUser(name, cty);
		} catch (InvalidCountryException e) {
			
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	
}
