package com.masai;

public class Employee {

	private int employeeld;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void calculateNetSalary(int pfpercentage){
		double net = this.salary - (pfpercentage*this.salary)/100;
		
		setnetSalary(net);
//		System.out.println(net);
	}
	
//	constructor
	public Employee() {
		
	}
	
//	getters
	public double getSalary() {
		return salary;
	}
	public double getnetSalary() {
		return netSalary;
	}
	public int getemployeeId() {
		return employeeld;
	}
	public String getemployeeName() {
		return employeeName;
	}
	
//	setters
	public void setSalary(double x) {
		this.salary=x;
	}
	public void setnetSalary(double x) {
		this.netSalary=x;
	}
	public void setemployeeId(int x) {
		this.employeeld=x;
	}
	public void setemployeeName(String x) {
		this.employeeName=x;
	}
	
	
}
