package com.masai;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
//toString @Overriden

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	
//	constructors
	
	public Student() {
	
		
		
	}
	
	public Student(int roll,String name,int marks,char grade) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	
	
//methods
	
	public void displayDetails() {
		
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		
		System.out.println("Enter roll number: ");
		int roll = scan.nextInt();
		
		System.out.println("Enter Name: ");
		String name = scanString.nextLine();
		
		System.out.println("Enter marks: ");
		int marks = scan.nextInt();
		
		char grade = calculateGrade(marks);
		Student s = new Student(roll,name,marks,grade);
	
		
		System.out.println(s);
		System.out.println("Grade: "+grade);
		
	}
	
	public char calculateGrade(int marks) {
		
		if(marks>=500) {
			return 'A';
		}
		else if(marks<500 && marks>=400) {
			return 'B';
		}
		else
			return 'C';
		
	}

	
//	Getters and Setters
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	

	
}
