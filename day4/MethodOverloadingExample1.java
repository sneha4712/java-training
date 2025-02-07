package com.celcom.day4;

//Method overloading
public class MethodOverloadingExample1 {

	void myMethod(int a) {
		int fact = 1;
				for(int i = 1; i <= 5; i++) {
					fact = fact * i;
					
				}
				System.out.println("factorial: " + fact);
	}
	
	void myMethod(int a, int b) {
		int sum = a + b;
		System.out.println("Addition: " + sum);
	}
	
	void myMethod(String name) {
		System.out.println("welcome: " + name);
	}
	public static void main(String[] args) {
		MethodOverloadingExample1 obj = new MethodOverloadingExample1();
		obj.myMethod(10,20);
		obj.myMethod("Sneha");
		obj.myMethod(5);

	}

}
