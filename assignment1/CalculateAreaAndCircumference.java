package com.celcom.assignment1;


class Circle {
	
		
	public double calculateCircumference(double radius) {
		return 2 * 3.14 * radius;
	}
	public double calculateArea(double radius) {
		return 3.14 * radius * radius;
	}
}
public class CalculateAreaAndCircumference {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Area of Circle: " + circle.calculateArea(3.5));
		System.out.println("Circumference of Circle: " + circle.calculateCircumference(3.5));
		

	}

}
