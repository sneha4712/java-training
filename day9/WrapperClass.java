package com.celcom.day9;

import java.io.IOException;

public class WrapperClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int a = 10;
		Integer obj1 = new Integer(a); //Boxing
		int b = obj1.intValue(); // Un-Boxing
		
		//JDK 1.5
		Integer obj2 = a; // Auto boxing
		int c = obj2; // Auto un-boxing
	}

}
