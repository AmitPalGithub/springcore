package com.app.beans;

import java.util.Date;

public class Employee {
	
	private String name;
	private Date dateOfJoin;
	
	public Employee(String name, Date dateOfJoin) {
		super();
		this.name = name;
		this.dateOfJoin = dateOfJoin;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateOfJoin=" + dateOfJoin + "]";
	}

}
