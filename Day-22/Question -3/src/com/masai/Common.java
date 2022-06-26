package com.masai;

public class Common {
	public void fun1() {
		synchronized (Common.class) {
			for(int i=0;i<5;i++) {
				System.out.println("You need class level lock for this block");
			}
		}
	}
}
