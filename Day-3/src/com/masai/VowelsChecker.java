package com.masai;

public class VowelsChecker {

	
	void checker(char x) {
		
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'
		||x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
			System.out.println("It's a Vowel");
		}
		else if((x>='a'&& x<='z')||(x>='A'&& x<='Z')) {
			System.out.println("It's a Consonant");
		}
		else System.out.println("Invalid character");
	}
	
	public static void main(String[] args) {
		VowelsChecker c = new VowelsChecker();
		c.checker('a');
		c.checker('z');
		c.checker('e');
	}
	
}
