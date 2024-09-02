package com.app.beans;

import java.util.Date;

public class Student {
	
	private String name;
	private Date date;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", date=" + date + "]";
	}

}
