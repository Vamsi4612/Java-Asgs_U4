package com.masai;

public class Switch {

	public static void main(String[] args) {
		switchIt("Delhi");
	}
	
	static void switchIt(String cityname) {
		String city = cityname;
				switch(city) {
				case "Mumbai":
					System.out.println("Financial city");
					break;
				case "Kolkata":
					System.out.println("City of Joy");
					break;
				case "Delhi":
					System.out.println("Capital of the country");
					break;
				case "Bangalore":
					System.out.println("Cyber City");
					break;
				default:
					System.out.println("May be Other Indian City");
					break;
				}
	}
	
}
