package com.masai;

public class Student {
	private int roll;
	private String name;
	private int marks;
	

	public Student(int roll, String name,  int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	public Student() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
