package com.masai;

public final class Child extends Parent {
	
	public Child(int x) {
		super(x);
	}
	
	
	
	@Override
	public void method1() {
		System.out.println("inside method1 of Child class");
		System.out.println("Number: "+number);
	}
	
	public void method4() {
		System.out.println("inside method4 of Child class");
	}
	
}
