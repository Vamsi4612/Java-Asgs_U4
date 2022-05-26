package com.masai;

import java.util.Scanner;

public class AccountDetails {
	
	public static void main(String[] args) {
		AccountDetails acc = new AccountDetails();
		
		Account details = acc.getAccountDetails();
	
		int withdrawAmt = acc.getWithdrawAmount();
		
		details.withdraw(withdrawAmt);
		
	}
	
	public Account getAccountDetails() {
		Account details = new Account();
		
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		
		System.out.println("Enter account id:");
		int id = scan.nextInt();
		details.setId(id);
		
		System.out.println(" Enter account type");
		String type = scanString.nextLine();
		details.setType(type);
		
		System.out.println("Enter balnce:");
		int balance = scan.nextInt();
		details.setBalance(balance);
		
		return details;
	}
	
	public int getWithdrawAmount() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter amount to be withdrawn:");
		
		int withdrawAmt = scan.nextInt();
		
		if(withdrawAmt<=0) {
			getWithdrawAmount();
		}
		return withdrawAmt;
		
	}
	
}
