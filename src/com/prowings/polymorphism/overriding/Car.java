package com.prowings.polymorphism.overriding;

public class Car{
	
	
	public String toString()
	{
		System.out.println("this is my own behaviour of toString method!!");
		return "Hellllloooooo";
	}

	
	public int hashCode()
	{
		System.out.println("inside car's hashcode method!!");
		return 999;
	}
	
}
