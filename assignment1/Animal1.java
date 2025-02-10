package com.celcom.assignment1;

class Inheritance {
	
	public void makeSound() {
		System.out.println("general animal sound");
		
	}
}

class Cat extends Inheritance {
	public void makeSound() {
		System.out.println("meow");
	}
}
public class Animal1 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.makeSound();

	}

}
