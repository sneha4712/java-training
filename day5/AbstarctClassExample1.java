package com.celcom.day5;


// Interface
interface Vehicleplan1 {
	void noOfEngine(); // By default interface methods all are public and abstract
	
}
interface Vehicleplan2 {
	void brandName();
	void noOfWheels();
}
//Abstract class
abstract class Vehicle implements Vehicleplan1, Vehicleplan2 {
	public void noOfEngine( ) {
		System.out.println("I have a engine");
	}

}

class Car extends Vehicle {
	public void noOfWheels() {
		System.out.println("I have four Wheels");
	}
	
	public void brandName() {
		System.out.println("My brand name is Jaguar");
	}
}
abstract public class AbstarctClassExample1 {

	public static void main(String[] args) {
		Car vec = new Car();
		vec.noOfWheels();
		vec.brandName();
		vec.noOfEngine();

	}

}
