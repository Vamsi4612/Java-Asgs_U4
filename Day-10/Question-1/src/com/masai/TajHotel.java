package com.masai;

public class TajHotel implements Hotel {
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}

	@Override
	public void chickenBiryani() {
		System.out.println("Chicken biryani from TajHotel");
		
	}

	@Override
	public void masalaDosa() {
		System.out.println("Masala Dosa from TajHotel");
		
	}
	
	
}
