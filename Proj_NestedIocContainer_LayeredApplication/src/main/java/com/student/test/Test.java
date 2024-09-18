package com.student.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.controller.StudentMainAppController;
import com.student.vo.StudentVo;

public class Test {

	public static void main(String[] args) {


		ApplicationContext parentCtx, childCtx=null;
		
		parentCtx = new ClassPathXmlApplicationContext("parentApplicationContext.xml");
		
		
		//create the child ioc container

		childCtx = new ClassPathXmlApplicationContext(new String[] {"childApplicationContext.xml"},parentCtx);
		
		StudentMainAppController controller = childCtx.getBean("controller", StudentMainAppController.class);
		
		try {
			List<StudentVo> voList = controller.processFetchAllStudentsRecordRequest();
			System.out.println(voList);
			
			for(StudentVo n: voList) {
				
				System.out.print(n.getId()+"      ");
				System.out.print(n.getName()+"      ");
				System.out.print(n.getEmail()+"           ");
				System.out.print(n.getEmail());
				System.out.println();
				
			}
			
//			System.out.println(voList.get(1).getId());
//			System.out.println(voList.get(2).getName());
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			((AbstractApplicationContext)childCtx).close();
		}
		
	}

}
