package com.masai;

import java.util.Scanner;

public class Main {
	
 public static void main(String[] args) {
	 Ticket data = new Ticket();
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter TicketId");
	 int id = scan.nextInt(); 
	 data.setticketid(id);
	 
	 System.out.println("Enter Price");
	 int price = scan.nextInt(); 
	 data.setprice(price);
	 
	 System.out.println("Enter no of Tickets");
	 int tickets = scan.nextInt(); 
	 data.setnooftickets(tickets);
	 
	 System.out.println("Enter avaliable Tickets");
	 int avaliabletickets = scan.nextInt(); 
	 data.setavaliabletickets(avaliabletickets);
	 
	 int amount = data.calculateTicketCost(data.getnooftickets());
	 
	 System.out.println("Total amount: "+amount);
	 System.out.println("Available ticket after booking: "+data.getavaliabletickets());
	 
 }
 
}
