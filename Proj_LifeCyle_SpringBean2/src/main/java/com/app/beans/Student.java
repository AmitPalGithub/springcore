package com.app.beans;

import java.util.Date;

public class Student {

	
	private String name;
	
	private Date dob;

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public void initialize() {
		System.out.println("init method invoked---student");
	}
	
	public void myDestroy() {
		System.out.println("destroy method invoked---student");
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", dob=" + dob + "]";
	}
}
