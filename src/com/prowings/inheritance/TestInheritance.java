package com.prowings.inheritance;

public class TestInheritance {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
//		A a = new A();
//		
//		a.printHello();
//		a.printHii();
//		
//		System.out.println(a.x);
//		System.out.println(a.y);

		
		B b = new B();
		
		b.m1();
		b.printHello();
		b.printHii();
		
		System.out.println(b.x);
		System.out.println(b.y);
		
		System.out.println("main ended!!");
		
	}

}
