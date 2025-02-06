package com.celcom.day3;

public class ThisAndConstructorExample2 {

	ThisAndConstructorExample2() {
		this("sneha");
		System.out.println("A");
		
	}
	
	ThisAndConstructorExample2(String name) {
		this(10);
		System.out.println("B");
	}
	
	ThisAndConstructorExample2(int a) {
		
		System.out.println("C");
		
	}
	
	public static void main(String args[]) {
		ThisAndConstructorExample2 obj1 = new ThisAndConstructorExample2 ();
	
	}
	
}
