package com.celcom.day4;

class Vehicle3 {
	void engine() {
		System.out.println("All vehicle has a engine");
		
	}
	
	void wheels() {
		System.out.println("All vehicle has a wheels");
	}
}

class wheels {
	void wheelModel() {
		System.out.println("Wheel model is MRF");
		
	}
	
	void noOfwheels(String vehicleType) {
		if(vehicleType.equals("Two Wheeler")) {
		System.out.println("I have two wheels");
	} else if(vehicleType.equals("four wheeler")) {
		System.out.println("I have four wheels");
	}
}
}

class Engine {
	void engineModel() {
		System.out.println("Engine model is XYZ");
	}
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class car extends Vehicle3 { // IS-A
	wheels wheel = new wheels(); // HAS-A
	Engine engine = new Engine(); // HAS-A
	
	void engineModel() {
		engine.engineModel();
	}
	
	void wheelModel() {
		wheel.wheelModel();
	}
	
	void noOfwheels() {
		wheel.noOfwheels("Four wheeler");
	}
}
public class HasARelationship {

	public static void main(String[] args) {
		
		car car = new car();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.wheelModel();
		car.noOfwheels();

	}

}
