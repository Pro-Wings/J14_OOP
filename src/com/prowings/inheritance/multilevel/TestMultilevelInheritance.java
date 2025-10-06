package com.prowings.inheritance.multilevel;

public class TestMultilevelInheritance {
	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.m1();
		c.m2();
		System.out.println(c.m3());
		
		System.out.println(c.hashCode());
		
	}

}
