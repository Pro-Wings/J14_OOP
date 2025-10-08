package com.prowings.inheritance.casting;

public class TestAutoBoxing {
	
	
	public static void m1(int x)
	{
		
		System.out.println("x == "+x);
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		Integer aa = 99;
		m1(aa);
		
		int x = 10;
		long y = x; //implicit promotion
		
		int z = (int) y; //explicit casting
		
		System.out.println("x = "+x);
		System.out.println("y = "+y); 
		System.out.println("z = "+z); 

		System.out.println("==============================");
		
		Integer a = 200;
		
//		Long b = a; //implicit promotion is not supported for wrapper classes
	
		Number b = a; //upcasting -- parent --> child
		
		Integer c = (Integer) b; //downcasting -- child --> parent
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		System.out.println("main ended!!");
		
		
	}

}
