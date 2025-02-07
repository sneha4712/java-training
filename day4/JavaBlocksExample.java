package com.celcom.day4;

public class JavaBlocksExample {
	{
	System.out.println("Instance block");
}
	JavaBlocksExample() {
		System.out.println("Constructor");
	}
	
	@Override
	public String toString() {
		return "To String";
	}

	static {
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println("Main Method block");
		
		JavaBlocksExample obj = new JavaBlocksExample();
		System.out.println(obj);

	}

}
