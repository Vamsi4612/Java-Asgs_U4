package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ram", 14, 580));
		students.add(new Student("Ravi", 18, 950));
		students.add(new Student("Kiran", 13, 440));
		students.add(new Student("Vinay", 12, 760));
		students.add(new Student("Avinash", 16, 880));
		
		
		List<Student> list = students.stream().filter(s -> s.getMarks()<800).collect(Collectors.toList());
		
		for(Student l : list) {
		System.out.println(l.getName()+"--"+l.getRoll()+"--"+l.getMarks());
		}
		
	}
}
