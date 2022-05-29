package com.masai;

public class AxisBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails() {
		System.out.println("Branch name: "+branchName);
		System.out.println("Ifsc Code: "+IfscCode);
		System.out.println("Rate of Interest: "+rateOfInterest);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
	public AxisBank() {
		
	}
	
	
	public AxisBank(String x,String y,double z) {
		this.branchName = x;
		this.IfscCode = y;
		this.rateOfInterest = z;
	}
	
}
