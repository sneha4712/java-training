package com.celcom.assignment1;

class Dog {
	String name;
	String breed;
	
	public Dog(String name,String breed) {
		this.name = name;
		this.breed = breed;
		
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("New name: " + name);
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
		System.out.println("New Breed: " + breed);
	}

	public void display() {
		System.out.println("name: " + name);
		System.out.println("Breed: " + breed);
	}
	
}
public class Animal {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Rocky", "Golden Shepherd");
		Dog dog2 = new Dog("Cherry","Golden Retriever");
		
		dog1.display();
		dog2.display();
		
		dog1.setName("Rocky");
		dog1.setBreed("labrador");

	}

}
