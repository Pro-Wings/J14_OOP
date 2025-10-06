package com.prowings.inheritance.casting;

public class TestObjectCreation {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		A a1 = new A();
		
		a1.m1();
		
		B b1 = new B();
		
		b1.m2();
		
		A a2 = new B();
		
		System.out.println("main ended!!");
		
	}

}
