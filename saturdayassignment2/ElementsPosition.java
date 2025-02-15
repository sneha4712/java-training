package com.celcom.saturdayassignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ElementsPosition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter an elements to add in the list");
		int elements = scanner.nextInt();
	
		
		System.out.println("Enter the elements");
		for (int i = 0; i < elements; i++) {
			int element = scanner.nextInt();
			list.add(element);
		}
		
		System.out.println("Enter the ArrayList");
		for (int i = 0; i < elements; i++) {
			System.out.println("Postion of elements : " + i + list.get(i));
		}

	}

}
