package com.celcom.day3;

public class ThisAndConstructor {

	String name;
	
	ThisAndConstructor() {
		this("Sneha");
		}
	ThisAndConstructor (String name) {
		this.name = name;
		this.greeting();
		
	}
	
	void greeting() {
		System.out.println("welcome " + name);
	
	}
	
	public static void main(String args[]) {
		ThisAndConstructor obj = new ThisAndConstructor();
		
	}
}
