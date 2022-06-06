package com.masai;

public class TemporaryEmployee extends Employee {
	
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int id, String name, int hoursWorked, int hourlyWages) {
		super(id, name);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	
	
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double salary = (this.hoursWorked*this.hourlyWages);
		this.salary = salary;
	}
	
	
}
