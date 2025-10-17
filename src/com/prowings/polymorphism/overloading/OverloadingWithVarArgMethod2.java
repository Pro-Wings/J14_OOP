package com.prowings.polymorphism.overloading;

public class OverloadingWithVarArgMethod2 {
	
	public void m1(int a)
	{
		System.out.println("inside m1(int a)");
	}

//	public void m1(char a)
//	{
//		System.out.println("inside m1(char a)");
//	}

//	public void m1(Character a)
//	{
//		System.out.println("inside m1(Character a)");
//	}

//	public void m1(char... a)
//	{
//		System.out.println("inside m1(char... a)");
//	}

//	public void m1(int... a)
//	{
//		System.out.println("inside m1(int... a)");
//	}

	public void m1(Number... a)
	{
		System.out.println("inside m1(Number... a)");
	}

	public void m1(Number a)
	{
		System.out.println("inside m1(Number a)");
	}

	
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		OverloadingWithVarArgMethod2 obj = new OverloadingWithVarArgMethod2();
		
		obj.m1('a');
		
		System.out.println("main method ended!!");
		
	}
	
}
