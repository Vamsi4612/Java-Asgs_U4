package com.masai;

public class PermanentEmployee extends Employee{
	
	private double basicPay;
	
	
	
	public PermanentEmployee(int id, String name ,double pay) {
		super(id, name);
		this.basicPay = pay;
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double salary = (this.basicPay - (this.basicPay * 0.12));
		this.salary = salary;
	}

}
