package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;
import com.app.beans.Student;

public class PrototypeBeanScopeType {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp.hashCode());
		
		Employee emp2 = (Employee) context.getBean("emp");
		System.out.println(emp2.hashCode());

	
	}

}
