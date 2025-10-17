package com.prowings.polymorphism.overriding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println("Hello 4");

//		int result = 10/0;
//		System.out.println("Result is :"+result);

		try 
		{
			Connection con = DriverManager.getConnection("");
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Hello 5");
		System.out.println("Hello 6");
		System.out.println("Hello 7");
		System.out.println("Hello 8");
		
	}

}
