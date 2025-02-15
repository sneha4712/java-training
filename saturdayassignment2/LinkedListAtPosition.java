package com.celcom.saturdayassignment2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListAtPosition {

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
		
		System.out.println("Enter the elements to Iterate");
		int position = scanner.nextInt();
		ListIterator<Integer> it = list.listIterator(position);
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
	}


	}

}
