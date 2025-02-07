package com.celcom.day4;
// final keyword
final class Animal2 {
	String msg = getMessage();
	
	final String getMessage() {
		return "A";
	}
}
public class FinalKeywordExample {
	public static void main(String[] args) {
		
		Animal2 animal = new Animal2();
		System.out.println(animal.msg);
		
		final int a = 10;
	}

}
