package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.CollegeInfo;
import com.app.beans.Employee;
import com.app.beans.Student;
import com.app.beans.User;
import com.app.beans.properties.EmployeeDesig;

public class CollectionInjectionTest {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
		
		System.out.println("----------------------------");
		
		
		Employee employee = context.getBean("emp",Employee.class);
		System.out.println(employee);
		
		
		System.out.println("----------------------------");
		
		
		User user = (User) context.getBean("user");
		System.out.println(user);
		

		System.out.println("----------------------------");
		
		
		CollegeInfo clg= (CollegeInfo) context.getBean("clg");
		System.out.println(clg);
		
		
		System.out.println("----------------------------");
		
		
		EmployeeDesig emp= (EmployeeDesig) context.getBean("employee");
		System.out.println(emp);
		
	}

}
