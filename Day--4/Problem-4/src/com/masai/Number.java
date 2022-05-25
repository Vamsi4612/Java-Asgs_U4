package com.masai;

public class Number {
	
	void checkNumber(int x) {
		if(x>=0) {
			if(x%2!=0) {
				System.out.println(x);
			}
			else {
				int a = 10-(x%10);
				System.out.println(x+a);
			}
		}
		else System.out.println("Error");
	}
	
	
	public static void main(String[] args) {
		Number n = new Number();
		n.checkNumber(44);
		n.checkNumber(45);
		n.checkNumber(-5);
	}
	
}
