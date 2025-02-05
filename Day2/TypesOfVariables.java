package com.celcom.day2;

//Types of Variable
public class TypesOfVariables {
int b = 20; //instance or Object variable
static int c = 30; //static or class variable

public static void main(String args[])  {
	int a = 10; // local variable
	System.out.println(a);
	
	TypesOfVariables obj = new TypesOfVariables();
	System.out.println(obj.b);
	
	System.out.println(TypesOfVariables.c);
	
}
}
