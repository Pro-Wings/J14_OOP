package com.prowings.inheritance.multiple;

public class C extends A implements B 
{
	
	public void m3()
	{
		System.out.println("inside m3() of class C!!!");
	}
	
	public void m2()
	{
		System.out.println("this is impl of m2() in class C - from interface B");
	}

}
