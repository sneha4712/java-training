package com.celcom.day2;

//Types of methods in java
public class TypesOfMethods {

	
	void m1() {
		System.out.println("instance method");
		
	}
	
	static void m2() {
		System.out.println("static method");
	}
	
	public static void main (String args[]) {
		TypesOfMethods obj = new TypesOfMethods();
		obj.m1();
		
		TypesOfMethods.m2();
	}
}
