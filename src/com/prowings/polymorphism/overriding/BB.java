package com.prowings.polymorphism.overriding;

public class BB extends AA{

	void print(Number n) 
	{
		System.out.println("Child: Number");
	}

	void print(Integer n) 
	{
		System.out.println("Child: Integer");
	}

}
