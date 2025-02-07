package com.celcom.day4;

class Animal1 {
	int a = 10;

	void move() {
		System.out.println("cannot define");
	}
}

class Cat1 extends Animal1 {
	int b = 20;

	void move() {
		System.out.println("cat will walk");
	}

}

	public class OverridingExample3 {

		public static void main(String[] args) {
			
			Animal1 animal= new Cat1();
			animal.move();
			System.out.println(animal.a); //10
		}

	}


