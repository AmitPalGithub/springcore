package com.app.beans;

import java.util.Date;

public class Employee {
	
	private String name;
	
	private Date regDate;

	public void setName(String name) {
		this.name = name;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public void init() {
		System.out.println("init method invoked---employee");
	}
	
	public void destroy() {
		System.out.println("destroy method invoked---employee");
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", regDate=" + regDate + "]";
	}
	
}
