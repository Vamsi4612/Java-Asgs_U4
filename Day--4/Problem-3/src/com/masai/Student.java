package com.masai;

public class Student {
	
	String name;
	String collageName;
	int roll;
	String address;
	
	public Student() {
		this.name = "Karthik";
		this.collageName = "NIT";
		this.roll = 14;
		this.address = "Bengalore";
	}
	public Student(String name,String clg,int roll,String address) {
		this.name = name;
		this.collageName = clg;
		this.roll = roll;
		this.address = address;
	}
	
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT == true) {
			Student s = new Student();
			return s;
		}
		else {
			Student s = new Student("Vinay","IIT",23,"Hyderabad");
			return s;
			
		}
	}

	
	public static void main(String[] args) {
		Student d1 = Student.getStudent(true);
		Student d2 = Student.getStudent(false);
		
		System.out.println("Student-1 details:");
		System.out.println("-----------------");
		System.out.println(d1.name);
		System.out.println(d1.collageName);
		System.out.println(d1.roll);
		System.out.println(d1.address);
		System.out.println("");
		
		System.out.println("Student-2 details:");
		System.out.println("-----------------");
		System.out.println(d2.name);
		System.out.println(d2.collageName);
		System.out.println(d2.roll);
		System.out.println(d2.address);
	}
}
