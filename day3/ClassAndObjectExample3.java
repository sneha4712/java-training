package com.celcom.day3;
//class and Object Example - 3

import com.celcom.day3.Bike;

class Bike {
	//variable declaration
	int ebrandnumber; 
	String ebrandname;
	double ebrandprice;
	
	//Constructor
	Bike(int brandnumber, String brandname, double brandprice) {
		ebrandnumber = brandnumber;
		ebrandname = brandname;
		ebrandprice = brandprice;
	}
	//Method
	void display() {
		System.out.println("Bike Brandnumber : " + ebrandnumber);
		System.out.println("Bike Brandname : " + ebrandname);
		System.out.println("Bike Brandprice : " + ebrandprice);
	}
}

public class ClassAndObjectExample3 {
	public static void main(String args[])  {
		Bike honda = new Bike(101, "Honda", 20000);
		honda.display();
		Bike spencer  = new Bike(102, "spencer",20000);
		spencer.display();
	}
}

