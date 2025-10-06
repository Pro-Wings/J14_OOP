package com.prowings.encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setFullName("Ram Raje");
		
		emp.setId(0);
		
		System.out.println("Name of Employee = " + emp.getFullName());
		System.out.println("ID of employee = "+ emp.getId());
		
		
	}

}
