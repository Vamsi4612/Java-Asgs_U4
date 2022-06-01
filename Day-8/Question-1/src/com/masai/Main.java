package com.masai;

public class Main {
	public static void main(String[] args) {
		Bird b1 =new Bird();
		
		b1.fly();
		
		Parrot p = (Parrot) b1;
		
		p.sing();
		
	}
}
