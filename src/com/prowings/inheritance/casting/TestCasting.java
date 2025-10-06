package com.prowings.inheritance.casting;

public class TestCasting {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		Parent p1 = new Parent();
		
		p1.m1();
//		p1.m2(); //not possible as Childs method is not visible to Parent
		
		Parent p2 = new Child();
		
		p2.m1();
//		p2.m2(); //still not visible - as p2 is reference of Parent
		
		Child c1 = new Child();
		
		c1.m1();
		c1.m2();
		
		
		Child c2 = (Child) p2; //Downcasting -
		
		c2.m1();
		c2.m2();
		
//		Child c3 = (Child) p1; // at ruintime this will throw - Classcast Exception
//		c3.m1();
//		c3.m2();
		
		System.out.println("main ended!!");
		
	}

}
