package com.masai;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		HashMap<String, Student> hm = new HashMap<>();
		hm.put("Andhra Pradesh", new Student(14,"vamsi", 980));
		hm.put("Taminadu", new Student(18,"kiran", 780));
		hm.put("Karnakata", new Student(12,"tanuja", 880));
		hm.put("Maharastra", new Student(16,"vinay", 680));
		hm.put("Kerala", new Student(15,"tarun", 740));
		
		StudentmarksComp comp = new StudentmarksComp();
		Set<Map.Entry<String, Student>> t = new TreeSet<>(comp);
	
		for(Map.Entry<String, Student> val : hm.entrySet() ) {
			t.add(val);
		}
		

		for(Map.Entry<String, Student> s1 : t) {
			System.out.println(s1.getKey());
			System.out.println("=============");
			
			System.out.println("Name: "+s1.getValue().getName());
			System.out.println("Roll: "+s1.getValue().getRoll());
			System.out.println("Marks: "+s1.getValue().getMarks());
			System.out.println("");
			
		}
		
		
	}
	
}
