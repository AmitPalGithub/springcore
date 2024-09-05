package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	
	private String name;
	private int rollNo;
	private Date dob;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Required
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", dob=" + dob + "]";
	}
	

}
