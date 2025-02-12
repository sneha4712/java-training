package com.celcom.main;

import com.celcom.pack1.MyClass1;
import com.celcom.pack2.MyClass2;
//Normal Import
import java.lang.Math;
//static import
import static java.lang.Math.PI;
import static java.lang.Integer.*;
import static java.lang.System.out;

public class MainClass {
	static int a = 20;

	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1();
		
		obj1.myMethod1();
		obj1.myMethod2();
		
		MyClass2 obj2 = new MyClass2();
		obj2.myMethod3();
		
		out.println(Math.PI);
		System.out.println(PI);
		System.out.println(a);
		
	    int a = Integer.parseInt("ABC");
		
		out.println("System is imported");
	}

}
