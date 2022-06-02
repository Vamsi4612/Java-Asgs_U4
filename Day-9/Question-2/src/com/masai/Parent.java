package com.masai;

public class Parent {
	
	final int number;
	
	public Parent(int x) {
		this.number = x;
	}
	
	
	public void method1() {
		System.out.println("inside method1 of Parent class");
		System.out.println(number);
	}
	public final void method2() {
		System.out.println("inside method2 of Parent class");
	}
	
	public void method3() {
		System.out.println("inside method3 of Parent class");
	}
	
	
	
}
