package com.prowings.polymorphism.overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Child extends Parent{
	
	public void m1() throws FileNotFoundException
	{
		
		System.out.println("inside childs m1()");
		
	}

}
