package com.prowings.polymorphism.overloading;

public class TestOverloading6 {
	
	public final int m1(int a, long b)
	{
		System.out.println("inside m1(int a, long b)");
		return 0;
	}

	private void m1(long a, long b)
	{
		System.out.println("inside m1(long a, long b)");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		TestOverloading6 obj = new TestOverloading6();
		
		obj.m1(10, 10);	
		
		System.out.println("main ended!!");
		
	}
	
}
