package com.masai;

public abstract class Employee {
	
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public Employee(int id,String name) {
		this.employeeId = id;
		this.employeeName = name;
	}
	
	abstract void calculateSalary();
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
