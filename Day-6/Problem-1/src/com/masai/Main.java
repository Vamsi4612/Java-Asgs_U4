package com.masai;

import java.util.Scanner;
class Main{
public static String reversString(String input){
//write the logic
	String s = "";
	for(int i=input.length()-1;i>=0;i--) {
		
		s = s+input.charAt(i);
		
	}
	return s;
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to reverse");
	String orignalString = sc.next();
	
	String result = reversString(orignalString);
	System.out.println("Original String is :"+ orignalString);
	System.out.println("Reversed String is :"+ result);
}
}