package com.prowings.polymorphism.overloading;

public class TestOverloading4 {
	
//	public static void m1(long x)
//	{
//		System.out.println("inside m1(long x)");
//	}

	public void m1(Object x)
	{
		System.out.println("inside m1(Object x)");
	}

//	public void m1(Number x)
//	{
//		System.out.println("inside m1(Number x)");
//	}

//	public void m1(Integer x)
//	{
//		System.out.println("inside m1(Integer x)");
//	}
	
//	public void m1(int x)
//	{
//		System.out.println("inside m1(int x)");
//	}

	public static void main(String[] args) {
		
		System.out.println("main mrthod started!!");
		
		TestOverloading4 obj = new TestOverloading4();
		int i = 20;
		
		obj.m1(i); //whenever we pass any raw number/digit like this, Compiler will consider that number as primitive int
		
		System.out.println("main mrthod ended!!");
		
	}

}
