package com.prowings.abstraction.abstractclass;

public class Child extends Parent
{
	int y = 20;
	
	public void printHii()
	{
		System.out.println("Hiiiiiiiiiiiii");
	}

	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.display();
		c.printHii();
		
		System.out.println(c.x);
		System.out.println(c.y);
	}
	
}
