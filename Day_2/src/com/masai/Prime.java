package com.masai;

public class Prime {
	static void primeNum(int num) {
		if(num>=2 && num<=200){
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.println(i);
				}
			}
		}
		else System.out.println("Invalid number");
	}
	public static void main(String[] args){
		primeNum(12);
	}
}