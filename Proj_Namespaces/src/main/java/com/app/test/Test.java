package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;
import com.app.beans.Student;

public class Test {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = (Student) context.getBean("stu");
		System.out.println(student);
		
		
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);

	}

}
