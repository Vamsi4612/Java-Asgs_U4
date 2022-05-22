package com.masai;

public class Student {
	String name;
	int roll;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Name is :"+name);	
		System.out.println("Roll is :"+roll);	
		System.out.println("Marks is :"+marks);	
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		
		s1.name = "Rahul";
		s1.roll = 42;
		s1.marks = 95;
		s1.displayStudentDetails();
		
		s2.name = "Vivek";
		s2.roll = 44;
		s2.marks = 92;
		s2.displayStudentDetails();
		
		s1 = null;
		s2 = null;
		
	}
}
