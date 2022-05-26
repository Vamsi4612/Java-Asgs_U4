package com.masai;

import java.util.Scanner;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	
	
	public boolean withdraw(int x) {
		int a = getBalance();
		if(x<getBalance()) {
			System.out.println("Balance amount after withdraw: "+(a - x));
			return true;
		}
		else{
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
	
	
//	constructor
	public Account() {
		
	}
	
	
//	getters
	public int getId() {
		return accountId;
	}
	public String getType() {
		return accountType;
	}
	public int getBalance() {
		return balance;
	}
	
//	setters
	public void setId(int x) {
		this.accountId = x;
	}
	public void setType(String x) {
		this.accountType = x;
	}
	public void setBalance(int x) {
		if(x>0) {
		this.balance = x;
		}
		else {
			Scanner scan = new Scanner(System.in);
			System.out.println("Balance should be positive");
			System.out.println("Enter balance:");
			int a = scan.nextInt();
			setBalance(a);
		}
	}

}
