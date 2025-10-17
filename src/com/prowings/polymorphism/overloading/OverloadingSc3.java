package com.prowings.polymorphism.overloading;

public class OverloadingSc3 {
	
//	public void m1(int i, int j)
//	{
//		System.out.println("inside m1(int , int)");
//	}
	
//	public void m1(long i, long j)
//	{
//		System.out.println("inside m1(long , long)");
//	}
	
	public void m1(int i, long j)
	{
		System.out.println("inside m1(int , long)");
	}

	public void m1(long i, int j)
	{
		System.out.println("inside m1(long , int)");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		OverloadingSc3 obj = new OverloadingSc3();
		
//		obj.m1(10, 10); //m1(int, int)
		
		System.out.println("main ended!!");
		
	}

}
