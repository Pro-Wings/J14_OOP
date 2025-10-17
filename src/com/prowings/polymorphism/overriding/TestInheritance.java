package com.prowings.polymorphism.overriding;

public class TestInheritance {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		A a1 = new A();
		a1.print();

		A a2 = new B();
		a2.print();
		
		B b1 = new B();
		b1.print();
		
//		B b2 = new A();
		
		B b3 = (B)a2;
		
		b3.print();
		
		System.out.println("main ended!!");
		
	}

}
