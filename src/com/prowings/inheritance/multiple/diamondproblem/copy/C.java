package com.prowings.inheritance.multiple.diamondproblem.copy;

public class C extends A implements B 
{
	
	public void m3()
	{
		System.out.println("inside m3() of class C!!!");
	}

	@Override
	public int m2() {
		
		System.out.println("this is impl of m2() from B interface and A ab class!!!");
		return 100;
	}

	@Override
	public void m2(int x) {
		System.out.println("this is impl of m2(int x) from B interface and A ab class!!!");
		
	}

	
}
