package com.app.beans.properties;

import java.util.Properties;

public class EmployeeDesig {
	
	private Properties employeeDesignation;

	public void setEmployeeDesignation(Properties employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	@Override
	public String toString() {
		return "Employee [employeeDesignation=" + employeeDesignation + "]";
	}
	
	
}
