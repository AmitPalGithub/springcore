package com.app.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Lazy(false)
@Scope("prototype")

public class Employee {
	
	@Value("amit")
	private String name;

	public Employee() {
		System.out.println("Employee.Employee()");
	}

	public String toString() {
		return "Employee [name=" + name + "]";
	}	
}
