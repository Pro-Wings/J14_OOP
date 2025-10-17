package com.prowings.polymorphism.overloading;

public class OverloadingSc2 {
	

	public void m1(int i, int j)
	{
		System.out.println("inside m1(int , int)");
	}
	
//	public void m1(long i, long j)
//	{
//		System.out.println("inside m1(long , long)");
//	}
//	
//	public void m1(long i, int j)
//	{
//		System.out.println("inside m1(long , long)");
//	}
	
	public void m1(Integer i, Integer j)
	{
		System.out.println("inside m1(Integer , Integer)");
	}

	public void m1(int i, Integer j)
	{
		System.out.println("inside m1(int , Integer)");
	}

	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		OverloadingSc2 obj = new OverloadingSc2();
		
		obj.m1(10, 10); //m1(int, int)
		
		System.out.println("main ended!!");
		
	}

}
