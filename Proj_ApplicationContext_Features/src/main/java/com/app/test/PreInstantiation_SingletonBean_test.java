package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;
import com.app.beans.Student;

public class PreInstantiation_SingletonBean_test {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Student student = (Student) context.getBean("stu");
		
//		System.out.println(student.hashCode());
//		student.showStudentDetails();
		
//		Amazon amazon = (Amazon) context.getBean("amazon");
	}

}
