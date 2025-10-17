package com.prowings.polymorphism.overloading;

public class VarArgMethodDemo {
	
	public void add(int...a) //this is a var-arg method
	{
		int sum = 0;
		for(int n : a)
		{
			sum = sum + n;
		}
		System.out.println("addition is : "+sum);
	}


	public static void main(String[] args) {
		
		VarArgMethodDemo obj = new VarArgMethodDemo();
		
		obj.add(10,20,7576123,98);
		
	}
	
}
