package com.prowings.polymorphism.overloading;

public class TestOverloading {
	


//	public void m1(short x)
//	{
//		System.out.println("inside m1(short x)");
//	}

//	public void m1(long x)
//	{
//		System.out.println("inside m1(long x)");
//	}

//	public void m1(double x)
//	{
//		System.out.println("inside m1(double x)");
//	}
	
	public void m1(int x)
	{
		System.out.println("inside m1(int x)");
	}

	public static void main(String[] args) {
		
		System.out.println("main mrthod started!!");
		
		TestOverloading obj = new TestOverloading();
		short s = 20;
		obj.m1(s); //whenever we pass any raw number/digit like this, Compiler will consider that number as primitive int
		
		System.out.println("main mrthod ended!!");
		
	}

}
