package com.masai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufReader{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("D:\\Coding\\Java\\SB-101\\SB101_Asgs_U5\\abc.txt"));
		String line = bf.readLine();
		while(line!=null) {
		System.out.println(line);
		line = bf.readLine();
		}
	}
	
}
