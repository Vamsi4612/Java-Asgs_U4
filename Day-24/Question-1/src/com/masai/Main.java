package com.masai;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		Creating 
		
		Path p = Paths.get("abc.txt");
			if(Files.exists(p)) {
				System.out.println("File is present");
				
			}
			else {
				try {
					Path p2 = Files.createFile(p);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
//			Writing
			
			List<String> l = Arrays.asList("sdfWEADVWEVwefvWEGVweafEAFQ","AEFFFFFFFFFFFFFFFFFFFFFCWE","ASDHBiuacygbOEQNUGwcibe");
			try {
				Files.write(p,l);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
//			Reading
			
			Path r = Paths.get("abc.txt");
			try {
				List<String> l1 = Files.readAllLines(p);
				for(String s : l1) {
					System.out.println(s);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
	}

}
