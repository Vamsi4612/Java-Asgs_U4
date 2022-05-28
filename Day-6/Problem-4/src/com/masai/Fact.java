package com.masai;

public class Fact {
	public static void main(String[] args) {
		
		Fact f = new Fact();
		
		if(args.length == 1) {
			String so = args[0];
			int io = Integer.parseInt(so);
			int ans = f.factorial(io);
			System.out.println(ans);
		}
		else if(args.length==2) {
			String so = args[0];
			String s1 = args[1];
			int io = Integer.parseInt(so);
			int i1 = Integer.parseInt(s1);
			int num = io-i1;
			int ans = f.factorial(num);
			System.out.println(ans);
		}
		else 
			System.out.println("Error");
	}
	
	public int factorial(int x) {
		
		int ans = 0;
		for(int i=0;i<=x;i++) {
			ans = ans + i;
		}
//		System.out.println("fact:"+ans);
		return ans;
	}
}
