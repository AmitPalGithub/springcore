package com.student.test;

import java.util.ArrayList;
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
			String name = controller.fetStudentName(1003);
			System.out.println("Student name: " +name);
			
			System.out.println("------------------");
			
			List<StudentDto> studentList =  new ArrayList();
			studentList = controller.fetStudentDetailsByCourse("java", "c++", "puthon");
			System.out.println(studentList);
			
			System.out.println("---------------------");
			
			StudentDto dto = new StudentDto();
			dto.setId(1010);
			dto.setName("Rohit Shetty");
			dto.setEmail("rohit@gmail.com");
			dto.setCourse_name("spring boot");
			dto.setObtained_marks(322);
			
			int i = controller.registerNewStudent(dto);
			System.out.println(i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			((AbstractApplicationContext)context).close();
		}
	}
}
