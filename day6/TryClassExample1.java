package com.celcom.day6;

public class TryClassExample1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
			//int a = Integer.parseInt("Hello");
			//int arr[] = {10,20,30};
			int a = 10/0;
		} catch (ArithmeticException e) {
			System.out.println("A");
			try {
				int a = Integer.parseInt("hello");
				
			} catch(NumberFormatException e1) {
				System.out.println(e1);
			}
		} catch(NumberFormatException e1) {
			System.out.println("B");
		} catch(NegativeArraySizeException e1) {
			System.out.println("C");
		} catch(Exception e) {
			System.out.println("D");
		}
		System.out.println("After Exception");

	}
	}
