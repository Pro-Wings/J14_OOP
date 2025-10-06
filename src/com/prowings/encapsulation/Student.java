package com.prowings.encapsulation;

public class Student {
	
	private int rollNumber;
	private String name;
	private int age;
	private int marks;
	
	
	
	public Student(int rollNumber, String name, int age, int marks) {
		super();
		setRollNumber(rollNumber);
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter method
	public int getRollNumer()
	{
		return this.rollNumber;
	}
	
	//setter method
	public void setRollNumber(int rollnumber)
	{
		if(rollnumber>=1 && rollnumber <=30)
		{
			this.rollNumber = rollnumber;
		}
		else
		{
			System.out.println("Invalid roll number!!!");
		}
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		int res = this.marks - 5;
		return res;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
