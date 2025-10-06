package com.prowings.encapsulation;

public class Employee {
	
	private int id;
	private String fullName;

	private String firstName;
	private String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
//		return fullName;
		return firstName+" "+lastName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	
}
