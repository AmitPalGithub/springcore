package com.app.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.student.controller.StudentMainAppController;

@SpringBootApplication
public class ProjSpringBootSpringjdbcApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = null;
		context = SpringApplication.run(ProjSpringBootSpringjdbcApplication.class, args);
		StudentMainAppController controller = (StudentMainAppController) context.getBean("mainController");
		try {
			System.out.println(controller.fetchStudentName(1005));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			((ConfigurableApplicationContext)context).close();
		}
	}

}
