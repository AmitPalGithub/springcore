package com.app.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.inject.Named;

@Named
public class Employee {
	
	@Value("amit")
	private String name;
	
	
	@Value("${emp.desig}")
	private String designation;

	
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}
	
	

}
