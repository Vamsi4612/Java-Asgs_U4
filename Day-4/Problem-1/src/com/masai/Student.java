package com.masai;

public class Student {
	
	private String name;
	private int roll;
	private int age;
	private int marks;
	
//	Constructors
	
	public Student(){
		
	}
	public Student(String name,int roll,int age,int marks){
		
		setName(name);
		setRoll(roll);
		setAge(age);
		setMarks(marks);
	}
	
//	getters
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	
//	setters
	public void setName(String x) {
		this.name = x;
	}
	public void setRoll(int x) {
		this.roll = x;
	}
	public void setAge(int x) {
		this.age = x;
	}
	public void setMarks(int x) {
		this.marks = x;
	}
	
//	main fun
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Ganesh",15,24,450);
		
		s1.setName("Avinash");
		s1.setRoll(19);
		s1.setMarks(480);
		s1.setAge(22);
		
		System.out.println("Student-1 details");
		System.out.println("------------------");
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		
		if(s1.getAge()>0 && s1.getAge()<60) {
		System.out.println(s1.getAge());
		}
		else System.out.println("Enter valid Age");
		if(s1.getMarks()>0 && s1.getMarks()<500) {
		System.out.println(s1.getMarks());
		}
		else System.out.println("Enter valid Marks");
		
		System.out.println("");
		
		System.out.println("Student-2 details");
		System.out.println("------------------");
		System.out.println(s2.getName());
		System.out.println(s2.getRoll());
		
		if(s2.getAge()>0 && s2.getAge()<60) {
		System.out.println(s2.getAge());
		}
		else System.out.println("Enter valid Age");
		if(s2.getMarks()>0 && s2.getMarks()<500) {
		System.out.println(s2.getMarks());
		}
		else System.out.println("Enter valid Marks");
		
		
	}
}
