package com.prowings.polymorphism.overriding;

public class TestObjectClassOverriding {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		Car c = new Car();
		
		String res = c.toString();
		System.out.println(res);
		
		int res2 = c.hashCode();
		System.out.println(res2);
		
		
		System.out.println("main method ended!!");
		
	}

}
