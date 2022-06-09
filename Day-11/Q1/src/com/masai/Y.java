package com.masai;

public interface Y {
	void fun_y1();
	default void fun_y2() {
		System.out.println("Y --- default func");
	}
	static void fun_y3() {
		System.out.println("Y --- static func");
	}
}
