package com.masai;

public class Sum {
	public static void main(String[] args) {
		sumIt(5);
	}
	static void sumIt(int n){
		int sum = (n*(n+1))/2;
		System.out.println(sum);
	}
}
