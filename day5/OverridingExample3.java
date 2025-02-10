package com.celcom.day5;

interface Animalplan {
	void move();
	void eat();
}
abstract class Animal1 implements Animalplan {
	public abstract void move();
	public abstract void eat();
	}

class Cat1 extends Animal1 {
	int b = 20;

	public void move() {
		System.out.println("cat will walk");
	}
	
	public void eat() {
		System.out.println("Fish");
	}

}

	public class OverridingExample3 {

		public static void main(String[] args) {
			
			Animal1 animal= new Cat1();
			animal.move();
			animal.eat();
			
		}

	}


