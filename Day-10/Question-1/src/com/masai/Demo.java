package com.masai;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount>1000) {
			return new TajHotel();
		}
		else if(amount>200 && amount<1000) {
			return new RoadsideHotel();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter amount : ");
		int amount  = sc.nextInt();		
		
		Demo d = new Demo();
		Hotel h = d.provideFood(amount);
		
		if(h!=null) {
			h.chickenBiryani();
			h.masalaDosa();
			if(h instanceof TajHotel) {
				((TajHotel)h).welcomeDrink();
			}
		}
		else {
			System.out.println("Please Enter valid amount;");
		}
		
	}
	
	
	
}
