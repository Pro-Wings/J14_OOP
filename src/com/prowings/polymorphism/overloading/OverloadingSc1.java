package com.prowings.polymorphism.overloading;

public class OverloadingSc1 {
	
	public void m1(A a)
	{
		System.out.println("inside m1(A a)!!");
	}
	public void m1(B b)
	{
		System.out.println("inside m1(B b)!!");
	}
	public void m1(C c)
	{
		System.out.println("inside m1(C c)!!");
	}
	public void m1(String s)
	{
		System.out.println("inside m1(String s)!!");
	}
	public void m1(Object o)
	{
		System.out.println("inside m1(Object o)!!");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		OverloadingSc1 obj = new OverloadingSc1();
//		obj.m1(null);
		
//		A a = new A();
//		obj.m1(a);

		B b = new C();
		obj.m1(b);
		
		System.out.println("main ended!!");
		
	}

}
