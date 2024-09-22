package com.student.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.controller.StudentMainController;
import com.student.dto.StudentDto;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentMainController controller = (StudentMainController) context.getBean("controller");
		try {
			StudentDto dto= null;
			dto = controller.processGetStudentDetailsRequest(1002);
			System.out.println(dto);
			
			System.out.println("Multiple records------------------");
			
			List<StudentDto> studentList = controller.fetchStudentsList("java", "c++", "python");
			System.out.println(studentList);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			((AbstractApplicationContext)context).close();
		}
	}
}
