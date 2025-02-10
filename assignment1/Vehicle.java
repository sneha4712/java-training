package com.celcom.assignment1;

class Vehicle1 {
	public void drive() {
		System.out.println("Driving vehicle");
	}
}

class car extends Vehicle1 {
	public void drive() {
		System.out.println("Repairing a car");
	}
}

public class Vehicle {

	public static void main(String[] args) {
		Vehicle1 car = new car();
		
		car.drive();

	}

}
