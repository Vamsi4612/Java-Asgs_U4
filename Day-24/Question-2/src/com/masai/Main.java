package com.masai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Address a1 = new Address();
		a1.setCity("Hyderabad");
		a1.setState("Andhra");
		a1.setPincode("521245");
		
		Student s1 = new Student(12, "Vinay",a1);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
			oos.writeObject(s1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Serialization completed");
		System.out.println("starting deserealization");
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
			try {
//				  Object o = ois.readObject();
				  Student s = (Student) ois.readObject();
				  System.out.println("deserialzation completed");
				  System.out.println(s);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
