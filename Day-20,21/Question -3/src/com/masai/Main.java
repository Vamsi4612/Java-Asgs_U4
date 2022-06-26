package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"Name1",850));
		students.add(new Student(12,"Name2",750));
		students.add(new Student(13,"Name3",650));
		students.add(new Student(14,"Name4",950));
		students.add(new Student(15,"Name5",750));
		
//		Stream<Student> s1 = students.stream();
//		Stream<Employee> e1 = s1.map(s -> {
//			Employee e = new Employee(s.getRoll(), s.getName(), s.getMarks()*1000);
//			return e;
//		});
//		
//		
//		List<Employee> e2 = e1.collect(Collectors.toList());
		
//						(Or)
		
		List<Employee> e2 = students.stream().map(e -> new Employee(e.getRoll(), e.getName(), e.getMarks()*1000)).collect(Collectors.toList());
		
		
		
		for(Employee emp : e2) {
			System.out.println(emp.getEmpId()+"--"+emp.getEmpName()+"--"+emp.getSalary());
		}
		
	}
	
}
