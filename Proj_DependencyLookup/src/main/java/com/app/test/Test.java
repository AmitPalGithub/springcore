package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student std = (Student) context.getBean("stu");
		std.attendingLiveClass();
		

	}

}
