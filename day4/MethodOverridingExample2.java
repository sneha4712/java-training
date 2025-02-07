package com.celcom.day4;

class Animal {
	void move() {
		System.out.println("cannot define");
	}
	
	void eat() {
		System.out.println("cannot define");
	}
}

class cat extends Animal {
	void move() {
		System.out.println("cat will move by walk");
	}
	
	void eat() {
		System.out.println("cat will eat rat");
	}
}

class Parrot extends Animal {
	void move() {
		System.out.println("parrot will fly");
	
	}
	
	void eat() {
		System.out.println("Parrot will eat fruits");
	}
}

class Fish extends Animal {
	void move() {
		System.out.println("Fish will swim");
		
	}
	
	void eat() {
		System.out.println("Fish will eat worms");
	}
}
public class MethodOverridingExample2 {

	public static void main(String[] args) {
		
		Animal animal; // ref for superclass
		animal = new cat();
		animal.move();
		animal.eat();
		
		animal = new Parrot();
		animal.move();
		animal.eat();
		
		animal = new Fish();
		animal.move();
		animal.eat();

	}

}
