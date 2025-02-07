package com.celcom.day4;

public class ConstructorOverloadingExample1 {

	ConstructorOverloadingExample1 (int a, int b) {
		this("HELLO", "WORLD");
		System.out.println("Integer Addition : " +(a + b));
	}
	
	ConstructorOverloadingExample1 (String a, String b) {
		this(10.5, 20.3);
		System.out.println("String Concat : " +(a + b));
	}
	
	ConstructorOverloadingExample1 (double a, double b) {
		System.out.println("Long Addition : " +(a + b));
	}
	public static void main(String[] args) {
		ConstructorOverloadingExample1 obj = new ConstructorOverloadingExample1(10, 20);
		//ConstructorOverloadingExample1 obj1 = new ConstructorOverloadingExample1("HELLO", "WORLD");
		//ConstructorOverloadingExample1 obj2 = new ConstructorOverloadingExample1(10L, 30L);
		
	
	}
	}
