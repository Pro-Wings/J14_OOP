package com.prowings.polymorphism.overloading;

public class OverloadingWithVarArgMethod {
	
//	public void m1(int a)
//	{
//		System.out.println("inside m1(int a)");
//	}

//	public void m1(long a)
//	{
//		System.out.println("inside m1(long a)");
//	}

//	public void m1(Integer a)
//	{
//		System.out.println("inside m1(Integer a)");
//	}

//	public void m1(int... a)
//	{
//		System.out.println("inside m1(int... a)");
//	}

//	public void m1(long... a)
//	{
//		System.out.println("inside m1(long... a)");
//	}

	public void m1(Integer... a)
	{
		System.out.println("inside m1(Integer... a)");
	}

	public void m1(Number a)
	{
		System.out.println("inside m1(Number a)");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		OverloadingWithVarArgMethod obj = new OverloadingWithVarArgMethod();
		
		obj.m1(10);
		
		System.out.println("main method ended!!");
		
	}
	
}
