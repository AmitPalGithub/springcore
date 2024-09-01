package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class SingleBeanScopeTest {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = (Student) context.getBean("stu");
		System.out.println(student.hashCode());
		
		Student student2 = (Student) context.getBean("stu");
		System.out.println(student2.hashCode());
	}

}
