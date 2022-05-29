package com.masai;

public class ICICIBank extends Bank{
	double rateOfInterest;
	
	@Override
	void displayDetails() {
		System.out.println("Branch name: "+branchName);
		System.out.println("Ifsc Code: "+IfscCode);
		System.out.println("Rate of Interest: "+rateOfInterest);
	}
	
	public ICICIBank() {
		
	}
	
	public ICICIBank(String x,String y,double z) {
		this.branchName = x;
		this.IfscCode = y;
		this.rateOfInterest = z;
		
	}
}
