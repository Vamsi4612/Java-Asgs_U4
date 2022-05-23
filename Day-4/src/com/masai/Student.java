package com.masai;

public class Student {
	
	String name;
	String collageName;
	int roll;
	String address;
	
	public Student(String name,int roll,String address) {
		this.name = name;
		this.collageName = "NIT";
		this.roll = roll;
		this.address = address;
	}
	public Student(String name,String clg,int roll,String address) {
		this.name = name;
		this.collageName = clg;
		this.roll = roll;
		this.address = address;
	}
	
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT == true) {
			Student s = new Student("karthik",24,"Bengalore");
			return s;
		}
		else {
			Student s = new Student("Vinay","IIT",23,"Hyderabad");
			return s;
			
		}
	}

	
	public static void main(String[] args) {
		Student d1 = Student.getStudent(false);
		
		
		System.out.println(d1);
		System.out.println(d1.name);
		System.out.println(d1.collageName);
		System.out.println(d1.roll);
		System.out.println(d1.address);
	}
}
