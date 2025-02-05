package com.celcom.day2;
//class and object Example - 2

class Fruits {
	String color;
	int size;
	int price;
	
	//constructor
	Fruits(String color, int size, int price) {
		this.color = color;
		this.size = size;
		this.price = price;
		
	}
	//method
	void display() {
		System.out.println("Fruit color " + color);
		System.out.println("Fruit size " + size);
		System.out.println("Fruit price " + price);
	}
	void setPrice(int price) {
		this.price = price;
		
	}
	
}
public class ClassAndObjectExample2 {
	public static void main(String args[])  {
	Fruits apple = new Fruits("Red", 10, 200);
	
	apple.display();
	apple.setPrice(300);
	apple.display();
	}
}
