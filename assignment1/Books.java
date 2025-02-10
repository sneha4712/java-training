package com.celcom.assignment1;
import java.util.Scanner;

class Collections {
	
	String title;
	String author;
	int ISBN;
	
	public Collections(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	void addBooks() {
		System.out.println("Book added: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Book ISBN: " + ISBN);
		
	}
	
	void removeBooks(String title1, String author1, int ISBN1) {
		System.out.println("Books removed: " + title1);
		System.out.println("Book Author: " + author1);
		System.out.println("Book ISBN: " + ISBN1);
	}
	
		
	}
public class Books {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of books to be added: ");
		String title = sc.next();
		String author = sc.next();
		int ISBN = sc.nextInt();
		
		Collections collections = new Collections(title, author, ISBN);
		collections.addBooks();
		collections.removeBooks("A", "note", 1234);

	}

}
