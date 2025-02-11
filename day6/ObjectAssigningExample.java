package com.celcom.day6;

//Object Assigning example
public class ObjectAssigningExample {

	public static void main(String[] args) {
		ObjectAssigningExample obj1 = new ObjectAssigningExample();
		System.out.println(obj1.hashCode());
		
		ObjectAssigningExample obj2 = obj1; //Object Assignment
		
		System.out.println(obj2.hashCode());

	}

}
