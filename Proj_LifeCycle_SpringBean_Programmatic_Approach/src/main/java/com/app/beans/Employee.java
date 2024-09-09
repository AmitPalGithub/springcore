package com.app.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	
	private String name;
	


	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method invoked--employee");
		name=null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method invoked--employee");
		if(name==null) {
			throw new IllegalArgumentException("employee name can not be null");
		}
		
	}

}
