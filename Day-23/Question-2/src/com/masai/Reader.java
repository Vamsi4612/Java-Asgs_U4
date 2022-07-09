package com.masai;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Coding\\Java\\SB-101\\SB101_Asgs_U5\\abc.txt");
		long l = f.length();
		
		char[] c = new char[(int)l];
		
		FileReader fr = new FileReader(f);
		fr.read(c);
		
		for(char word : c) {
			System.out.print(word);
		}

		
	}
}
