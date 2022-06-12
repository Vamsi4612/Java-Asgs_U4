package com.masai;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		
		
		Account a = new Account("123456");
	
		a.deposit(5000);
		double bal = a.Balance;
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Avaliable amount "+bal);
			System.out.println("Enter Amount to withdraw");
			double amt = sc.nextDouble();
			
			double availBalance = a.withdraw(amt);
			
			System.out.println("Withdaw Successfull");
			
			System.out.println(availBalance);
			
		} catch (InsufficientFundsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
		System.out.println("Transaction Ended");
	}

}
