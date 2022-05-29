package com.masai;

public class Student {
	int studId;
	String stdName;
	double examFee;
	
	public void displayDetails() {
		
	}
	public double payFee(float x) {
		double ans = this.examFee+x;
		return ans;
	}
	public Student() {
		this.examFee = 2000;
	}
	
}
