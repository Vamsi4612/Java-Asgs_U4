package com.masai;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Product s = new Product();
		Thread t1 = new Thread(s);
		t1.start();
		
		t1.join();

		System.out.println("Sum of 1 to 10 : "+s.val);
	}
}
