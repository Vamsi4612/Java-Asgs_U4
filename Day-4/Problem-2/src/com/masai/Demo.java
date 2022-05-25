package com.masai;

public class Demo {
	
	public Demo() {
		this("Hello");
		System.out.println("constructor with no parameter");
	}
	
	public Demo(String s) {
		this(10);
		System.out.println("constructor with String parameter -- "+s);
		
	}
	
	public Demo(int s) {
		this(52.00f);
		System.out.println("constructor with int parameter -- "+s);
		
	}
	public Demo(float s) {
		System.out.println("constructor with float parameter -- "+s);
		
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		
	}
	
}
