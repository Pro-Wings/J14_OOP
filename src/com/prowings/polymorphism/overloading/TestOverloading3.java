package com.prowings.polymorphism.overloading;

public class TestOverloading3 {
	
	public void m1(Object o)
	{
		System.out.println("inside m1(Object o)");
	}

//	public void m1(String s)
//	{
//		System.out.println("inside m1(String s)");
//	}

//	public void m1(Number s)
//	{
//		System.out.println("inside m1(Number s)");
//	}

	public void m1(Integer s)
	{
		System.out.println("inside m1(Integer s)");
	}

//	public void m1(StringBuffer s)
//	{
//		System.out.println("inside m1(StringBuffer s)");
//	}
//
//	public void m1(Boolean s)
//	{
//		System.out.println("inside m1(StringBuffer s)");
//	}

	
	
	public static void main(String[] args) {
		
		System.out.println("main mrthod started!!");
		
		TestOverloading3 obj = new TestOverloading3();
		
		obj.m1(null);
		
		System.out.println("main mrthod ended!!");
		
	}

}
