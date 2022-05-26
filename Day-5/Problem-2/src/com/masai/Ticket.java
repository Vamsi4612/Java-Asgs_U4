package com.masai;

import java.util.Scanner;

public class Ticket {
	private int ticketid;
	private int price;
	static int avaliabletickets;
	private int nooftickets;
	
	public int calculateTicketCost(int nooftickets) {
		if(getavaliabletickets()>0 && getavaliabletickets()-nooftickets>0) {
			int n = getavaliabletickets()-nooftickets;
			setavaliabletickets(n);
			int amount = price*nooftickets;
			return amount;
		}
		return -1;

	}
	
//	constructor
	public Ticket() {
		
	}
	
//	getters
	public int getticketid() {
		return ticketid;
	}
	public int getprice() {
		return price;
	}
	public int getavaliabletickets() {
		return avaliabletickets;
	}
	public int getnooftickets() {
		return nooftickets;
	}
	
//	setters
	
	public void setticketid(int x) {
		this.ticketid = x;
	}
	public void setprice(int x) {
		this.price = x;
	}
	public void setavaliabletickets(int x) {
		Scanner scan = new Scanner(System.in);
		if(x<0) {
			System.out.println("Enter valid number for avaliabletickets");
			int a = scan.nextInt();
			setavaliabletickets(a);
		}
		else Ticket.avaliabletickets = x;
		System.out.println();
	}
	public void setnooftickets(int x) {
		this.nooftickets = x;
	}
	
}
