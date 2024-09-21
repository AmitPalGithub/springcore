package com.student.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.controller.StudentMainController;
import com.student.dto.StudentDto;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentMainController controller = (StudentMainController) context.getBean("controller");
		try {
			StudentDto dto= null;
			
			dto = controller.processGetStudentDetailsRequest(1004);
			System.out.println(dto);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
