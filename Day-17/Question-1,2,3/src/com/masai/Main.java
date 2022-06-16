package com.masai;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		PlayList p = new PlayList();
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count<4) {
			System.out.println("Enter movie name");
			String movie = sc.next();
			System.out.println("Enter song name");
			String song = sc.next();
			count++;
			p.addSong(new Song(movie, song));
		}
		
		
		for(Song item : p.songs) {
			
			item.play();
			
		}
		
		
	}
	
	
	
}
