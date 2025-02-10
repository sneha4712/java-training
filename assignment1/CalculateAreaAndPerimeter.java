package com.celcom.assignment1;

class Rectangle {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculatearea() {
		return width + height;
	}
	
	public double calculateperimeter() {
		return 2* (width + height);
	}
	
	public void display() {
		System.out.println("width: " + width);
		System.out.println("height: " + height);
		System.out.println("Area: " + calculatearea());
		System.out.println("Perimeter: " + calculateperimeter());
		
	}
	
}
public class CalculateAreaAndPerimeter {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5.5, 3.5);
		
		rectangle.display();

	}

}
