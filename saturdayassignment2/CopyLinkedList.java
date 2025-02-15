package com.celcom.saturdayassignment2;

import java.util.LinkedList;
import java.util.Scanner;

public class CopyLinkedList {
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
		LinkedList <Integer> list2 = new LinkedList<Integer>(list);
		System.out.println("Copied list is "+list2);

}
}
