package com.masai;

public class Product implements Runnable{
	
	int val;

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			val = val+i;
		}
		
	}

}
