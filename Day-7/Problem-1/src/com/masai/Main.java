package com.masai;

public class Main {
	public static void main(String[] args) {
		Employee d1 = new Employee();
		d1.Name = "Avinash";
		d1.Age = 23;
		d1.Phonenumber = "123654789";
		d1.Address = "Hyderabad";
		d1.Salary = 50000;
		
		Manager d2 = new Manager();
		d2.Name = "Ayush";
		d2.Age = 22;
		d2.Phonenumber = "123456789";
		d2.Address = "Bengalore";
		d2.Salary = 55000;
				
		System.out.println("Employee details: ");
		System.out.println("-------------------");
		System.out.println("Name: "+d1.Name);
		System.out.println("Age: "+d1.Age);
		System.out.println("Phone number: "+d1.Phonenumber);
		System.out.println("Address: "+d1.Address);
		System.out.println("Salary: "+d1.Salary);
		System.out.println("Specialisation: "+d1.Specialisation);
		System.out.println("Department: "+d1.Department);
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Manager details: ");
		System.out.println("-------------------");
		System.out.println("Name: "+d2.Name);
		System.out.println("Age: "+d2.Age);
		System.out.println("Phone number: "+d2.Phonenumber);
		System.out.println("Address: "+d2.Address);
		System.out.println("Salary: "+d2.Salary);
		System.out.println("Specialisation: "+d2.Specialisation);
		System.out.println("Department: "+d2.Department);
		
	}
}
