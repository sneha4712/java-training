package com.celcom.assignment1;

public class Employee {

	String name;
	String jobTitle;
	Double salary;
	
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		
	}
	public void display() {
		System.out.println("Inital salary: " + salary);
	}
		
	public double calculatesalary(double hra, double bonus, double tax) {
		return( hra + bonus + tax);
		
		
	}
	
	public void updatesalary(double bonus, double csalary, double salary) {
		System.out.println("Updated salary : " + (bonus+ csalary+ salary));
		
	}
		
	public static void main(String[] args) {
		Employee employee = new Employee("sneha", "AML analsyt", 50000);
		employee.display();
		double csalary = employee.calculatesalary(3000.3, 5000.50, 1000.56);
		employee.updatesalary(5000.50, csalary, 50000);

	}

}
