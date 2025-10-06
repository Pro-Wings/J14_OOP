package com.prowings.inheritance.multiple.diamondproblem;

public class C extends A implements B 
{
	
	public void m3()
	{
		System.out.println("inside m3() of class C!!!");
	}

	@Override
	public void m2() {
		
		System.out.println("this is impl of m2() from B interface!!!");
		
	}
	

	
	
}
