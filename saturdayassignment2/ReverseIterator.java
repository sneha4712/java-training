package com.celcom.saturdayassignment2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseIterator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		LinkedList <Integer> list = new LinkedList<Integer>();
		
		System.out.println("Enter an elements to add in the list");
		int elements = scanner.nextInt();
	
		
		System.out.println("Enter the elements");
		for (int i = 0; i < elements; i++) {
			int element = scanner.nextInt();
			list.add(element);
		}
		
		Iterator<Integer> it = list.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
	}


	}

}
