package com.masai;

import java.util.Scanner;

public class IPL {
	
	void homeTeamStadium(Stadium stadium){
		
		switch (stadium) {
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;

		default:
			break;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stadium :");
		String s = sc.next();
			
			Stadium st = Stadium.valueOf(s);	
			IPL i = new IPL();
			i.homeTeamStadium(st);
		
		}
	
	
}
