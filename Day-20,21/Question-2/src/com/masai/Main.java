package com.masai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<String> al = Arrays.asList("Mumbai","Hyderabad","Chennai","Kolkata","Delhi");
		Collections.sort(al, (c1,c2) -> c2.compareTo(c1));
		

		for(String result : al) {
			System.out.println(result);
		}
	}
}
