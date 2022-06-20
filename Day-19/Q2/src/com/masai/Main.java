package com.masai;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		lhm.put("Andhra Pradesh", "Hyderabad");
		lhm.put("Tamilnadu", "Chennai");
		lhm.put("Karnakata", "Bengalore");
		lhm.put("Maharastra", "Mumbai");
		lhm.put("West Bengal", "Kolkata");
		
		Set<Map.Entry<String, String>> s = lhm.entrySet();
		for(Map.Entry<String, String> s1 : s) {
//			System.out.println(s1);
			System.out.println(s1.getKey()+"----"+s1.getValue());
		}
	}

}
