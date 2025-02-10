package com.celcom.assignment1;

class Id {
	String name;
	int age;
	
	 Id(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void display() {
		System.out.println("name: " + name);
		System.out.println("Age: " + age);
	}	
	}
public class Person {
	public static void main(String[] args) {
		Id person1 = new Id("sneha", 23);
		Id person2 = new Id("Ramesh", 30);
		
		person1.display();
		person2.display();
		
		
		

	}

}
