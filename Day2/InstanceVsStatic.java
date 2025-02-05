package com.celcom.day2;

//instance Vs staic
public class InstanceVsStatic {
int a = 10;

public static void main(String args[])  {
	InstanceVsStatic obj1 = new InstanceVsStatic();
	InstanceVsStatic obj2 = new InstanceVsStatic();
	
	System.out.println(obj1.a); //10
	System.out.println(obj2.a); //10
	
	obj1.a = 20;
	
	System.out.println(obj1.a); //20
	System.out.println(obj2.a); //20
}
}
