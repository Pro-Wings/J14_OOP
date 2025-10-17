package com.prowings.polymorphism.overloading;

public class VarArgMethodDemo2 {
	
	public void printNumbers(int[] numbers)
	{
		for(int i=0; i<numbers.length; i++)
			System.out.println(numbers[i]);
	}
	
	public void printNumbers(Long...numbers)
	{
		for(int i=0; i<numbers.length; i++)
			System.out.println(numbers[i]);
	}
	
	public static void main(String[] args) {
		
		VarArgMethodDemo2 obj = new VarArgMethodDemo2();
		
		int[] nums = {10,12,34,45};
//		short[] nums = {10,12,34,45};
		
		obj.printNumbers(nums);
		
		long l2 = 20L;
		long l3 = 30L;
		
		obj.printNumbers(l2,l3);
		
	}
	
}
