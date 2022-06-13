package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	
	List<Book> bookList = new ArrayList<>();
	
	
	void addBook(Book book) {
		
		
		bookList.add(book);
		
		
		
	}
	
	boolean isEmpty() {
		if(bookList.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	List<Book> viewAllBooks(){
		for(Book b : bookList) {
			System.out.println("****************************");
			System.out.println("ISBN no: "+b.getIsbn());
			System.out.println("Book name: "+b.getBookName());
			System.out.println("Author name: "+b.getAuthor());	
			System.out.println("****************************");
		}
		return bookList;
	}
	
	List<Book> viewBooksByAuthor(String author ){
		for(Book b : bookList) {
			if(author.equals(b.getAuthor())) {
				System.out.println("ISBN no: "+b.getIsbn());
				System.out.println("Book name: "+b.getBookName());
				System.out.println("Author name: "+b.getAuthor());	
			};	
		}
		return bookList;
	}
	
	int countNoOfBook(String bookName) {
		int count = 0;
		for(Book b : bookList) {
			if(bookName.equals(b.getBookName())) {
				count++;
			};
		}
		return count;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search Book by author");
		System.out.println("4.Count number of books - by book name");
		System.out.println("5.Exit");
		int n = sc.nextInt();
		
		Library l = new Library();
		
		if(n == 1) {
			Scanner sc1 = new Scanner(System.in);
			
			System.out.println("Enter the isbn no:");
			int isbn = sc1.nextInt();
			System.out.println("Enter the book name:");
			String name = sc1.next();
			System.out.println("Enter the author name:");
			String author = sc1.next();
			
			Book b = new Book(isbn, name, author);
			l.addBook(b);
			System.out.println("Book added successfully");
		}
		else if(n == 2) {
			l.viewAllBooks();
		}
		else if(n ==3) {
			System.out.println("Enter the author name:");
			String name = sc.next();
			l.viewBooksByAuthor(name);
		}
		else if(n==4) {
			System.out.println("Enter the book name:");
			String name = sc.next();
			l.countNoOfBook(name);
		}
		else {
			System.out.println("Thank You..!!");
		}
	}
	
	
	
	
	
	
	
	
	
}
