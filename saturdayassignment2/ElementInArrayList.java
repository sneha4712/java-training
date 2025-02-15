package com.celcom.saturdayassignment2;


import java.util.ArrayList;

public class ElementInArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		
		int elementsearch = 40;
		if(list.contains(elementsearch)) {
			System.out.println("The element search is " + elementsearch);
			
			}else {
				System.out.println("The element search is not in the list " + elementsearch);
		}
		
		

	}

}
