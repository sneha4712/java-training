package com.celcom.day4;

//Method overriding example
class SuperClass {
	void myMethod() {
		System.out.println("I am from super class");
		
	}
}

class SubClass extends SuperClass {
	void myMethod() {
		System.out.println("I am from sub class");
		
	}
}
public class MethodOverridingExample {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.myMethod();
		
		SuperClass obj1 = new SubClass();// overriding based on object and not on reference
		
		obj1.myMethod();

	}

}
