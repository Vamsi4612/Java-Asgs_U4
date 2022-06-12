package com.masai;

public class Account {
	String accountNumber;
	double Balance;
	
	
	void deposit(double balance) {
		this.Balance = balance;
	}
	
	double withdraw(double withDrawAmt) throws InsufficientFundsException {
		if(Balance>withDrawAmt) {
			Balance  =  (Balance - withDrawAmt);
			return Balance;
		}
		else {
			InsufficientFundsException ife = new InsufficientFundsException("Funds insufficient");
			throw ife;
		}
	}

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		
	}

}
