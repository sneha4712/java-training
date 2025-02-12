package com.celcom.day7;

interface MyInterface {
	void display();
}

//Inner class
public class InnerClassExample implements MyInterface {
	
	//1.Non static inner class
	class InnerClass1 {
		void myMethod1() {
			System.out.println("Non-static inner class");
		}
	}
	
	//2.Static inner class
		static class InnerClass2 {
			void myMethod1() {
				System.out.println("Static inner class");
			}
		}
		
		void myMethod() {
			// 3. local inner class
			class InnerClass3 {
				void myMethod3() {
					System.out.println("Local Inner class");
				}
			}
			
			InnerClass3 inner3 = new InnerClass3();
			inner3.myMethod3();
		}
		//Anonymous Inner class
		public void display() {
			System.out.println("Anonymous inner class");
		}

	public static void main(String[] args) {
		InnerClassExample obj = new InnerClassExample();
		InnerClass1 inner1 = obj.new InnerClass1();
		inner1.myMethod1();
		
		InnerClassExample.InnerClass2 inner2 = new InnerClassExample.InnerClass2();
		inner2.myMethod1();
		
		InnerClassExample obj1 = new InnerClassExample();
		obj.display();
		
		MyInterface obj2 = new MyInterface() {
			public void display() {
				System.out.println("Display");
			}
		};
		obj1.display();
		
		//Lambda Expression
		MyInterface obj3 =() -> System.out.println("Display");
		obj2.display();

	}

}
