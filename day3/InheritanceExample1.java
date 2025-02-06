package com.celcom.day3;

class vehicle {
	void noOfEngine() {
		System.out.println("i have one engine");
	}
}

class TwoWheeler extends vehicle {
	void noOfWheels() {
		System.out.println("i have two wheels");
	}
}

class Bike1 extends TwoWheeler {
	void brandname() {
		System.out.println("My brand name is Honda");
	}
}

class Scooty extends TwoWheeler {
	void brandname() {
		System.out.println("My brand name is Activa");
		
	}
}
public class InheritanceExample1 {

	public static void main(String[] args) {
		Bike1 honda = new Bike1();
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandname();

		Scooty activa = new Scooty();
		activa.noOfEngine();
		activa.noOfWheels();
		activa.brandname();
		
}

}
