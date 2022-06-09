package com.masai;

public interface X {
	void fun_x1();
	default void fun_x2() {
		System.out.println("X --- default fun");
	}
	static void fun_x3() {
		System.out.println("X --- static fun");
	}
}
