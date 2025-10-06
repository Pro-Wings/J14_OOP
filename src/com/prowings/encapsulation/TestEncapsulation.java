package com.prowings.encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setName("Ram");
		s1.setRollNumber(23);
		s1.setMarks(87);
		s1.setAge(21);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRollNumer());
		System.out.println(s1.getAge());
		System.out.println(s1.getMarks());
		
		
	}

}
