package com.masai;

public class Main {
	
	public static void main(String[] args) {
		
		Animal[] a = new Animal[3];
		
		
		a[0] = new Cat();
		
		a[1] = new Dog();
		
		a[2] = new Tiger();
		
		
		for(int i=0;i<3;i++) {
			a[i].makeNoise();
			a[i].eat();
			a[i].walk();
		}
		
		
	}
	
	
}
