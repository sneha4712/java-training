package com.celcom.day3;

class Vehicle1 {
	String name = "I am a super class variable";

	Vehicle1() {
		System.out.println(" i am a super class constructor");
	}

	void noOfEngine() {
		System.out.println("i have one engine");
	}
}

class TwoWheeler1 extends Vehicle1 {
	TwoWheeler1() {
		super();
	}

	void noOfWheels() {
		super.noOfEngine();
		System.out.println("i have two wheels");
		System.out.println(super.name);
	}
}

public class InheritanceExample2 {

	public static void main(String[] args) {
		TwoWheeler1 two = new TwoWheeler1();
		two.noOfWheels();
	}

}
