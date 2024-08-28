package com.app.student.testapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.student.controller.StudentMainController;
import com.app.student.vo.StudentVo;

public class StudentMainApplication {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentMainController controller = context.getBean("mainController", StudentMainController.class);
	
		StudentVo vo = new StudentVo();
		vo.setId("1001");
		vo.setName("Amit Pal");
		vo.setEmail("amit@gmail.com");
		vo.setCourseName("java");
		vo.setObtMarks("250");
		
		try {
			controller.registerStudentRequest(vo);
		} 
		catch (Exception e) {
			System.out.println("something went wrong..");
			e.printStackTrace();
		}
		
		
	}

}
