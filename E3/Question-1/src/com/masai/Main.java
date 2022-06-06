package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++) {
			int el = sc.nextInt();
			arr[i] = el;
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int ind = sc.nextInt();
		
		
		System.out.println("The array element at index"+ind+" = "+arr[ind]);
		
		System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException n) {
			System.out.println("java.lang.NumberFormatException");
		}
		
	}

	
}
