package com.masai;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Countchar {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String name = sc.nextLine();
		System.out.println(" Enter the character to be counted");
		String letter = sc.nextLine();
		char c = letter.charAt(0);
		
		int count = 0;
		FileReader fr = new FileReader(name);
		int text = fr.read();
		while(text!=-1) {
			if((char)text == Character.toLowerCase(c)||(char)text == Character.toUpperCase(c)) {
				count++;
			}
			text = fr.read();
		}

		System.out.println("File "+name+" has "+count+" instance of letter "+letter);
	}

}
