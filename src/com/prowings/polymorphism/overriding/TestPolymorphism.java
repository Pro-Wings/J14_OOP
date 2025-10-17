package com.prowings.polymorphism.overriding;

public class TestPolymorphism {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
//		A a1 = new A();
//		a1.print();
//		a1.print(10);

		
		B b1 = new B();
		b1.print();
		b1.print(10);

		
//		A a2 = new B();
//		a2.print();
//		a2.print(10);

		
		System.out.println("main ended!!");
		
	}

}
