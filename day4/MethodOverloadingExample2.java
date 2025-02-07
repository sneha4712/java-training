package com.celcom.day4;

public class MethodOverloadingExample2 {

	void addition(int a, int b) {
		System.out.println("Integer Addition : " +(a + b));
	}
	
	void addition(double a, double b) {
		System.out.println("Double Addition : " +(a + b));
	}
	
	void addition(long a, long b) {
		System.out.println("long Addition : " +(a + b));
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample2 obj = new MethodOverloadingExample2();
		obj.addition(10.5, 30.0);
		obj.addition(20, 40);
		obj.addition(10L, 30L);

	}

}
