package com.prowings.polymorphism.overloading;

public class VarArgDemo {
	
	public int addition(int...numbers)
	{
		System.out.println("addition method with var-arg started!!");
		
		int result = 0;
		for(int i=0; i<numbers.length; i++)
		{
			result = result + numbers[i];
		}
		System.out.println("completed addition of numbers!!!");
		return result;
	}

	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		VarArgDemo obj = new VarArgDemo();
		int sum = obj.addition(10,20,30);
		System.out.println("Sum of given numbers is : "+ sum);

		
		int sum1 = obj.addition(100,200,300);
		System.out.println("Sum of given numbers is : "+ sum1);

		int sum2 = obj.addition(100,200,300,293847);
		System.out.println("Sum of given numbers is : "+ sum2);

		
		System.out.println("main ended!!");
		
	}
	
}
