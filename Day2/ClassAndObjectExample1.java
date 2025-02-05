package com.celcom.day2;
//class and Object Example - 1

class Employee {
	//variable declaration
	int eid; 
	String ename;
	double esalary;
	
	//Constructor
	Employee(int id, String name, double salary) {
		eid = id;
		ename = name;
		esalary = salary;
	}
	//Method
	void display() {
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
	}
}

public class ClassAndObjectExample1 {
	public static void main(String args[])  {
		Employee sneha = new Employee(101, "sneha", 20000);
		sneha.display();
		Employee Rajani  = new Employee(102, "Rajani",20000);
		Rajani.display();
	}
}
