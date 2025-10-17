package com.prowings.polymorphism.overloading;

public class TestOverloading5 {
	
	public final int m1(long a, int b)
	{
		System.out.println("inside m1(int a, long b)");
		return 0;
	}

	private void m1(int a, long b)
	{
		System.out.println("inside m1(int a, long b)");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		TestOverloading5 obj = new TestOverloading5();
		
//		obj.m1(10, 10);	private void m1(int a, long b)
		{
			System.out.println("inside m1(int a, long b)");
		}

		
		System.out.println("main ended!!");
		
	}
	
}
