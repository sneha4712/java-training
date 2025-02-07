package com.celcom.day4;

public class MethodOverloadingExample3 {

	void concat(int a, int b) {
		System.out.println(a+""+b);
	}
	
	void concat(String a, String b) {
		System.out.println(a+b);
	}
	
	void concat(double a, double b) {
		System.out.println(a+""+b);
	}
	public static void main(String[] args) {
		MethodOverloadingExample3 obj = new MethodOverloadingExample3();
		obj.concat(10, 30);
		obj.concat("welcome", "world");
		obj.concat(30.5, 30.5);
	

	}

}
