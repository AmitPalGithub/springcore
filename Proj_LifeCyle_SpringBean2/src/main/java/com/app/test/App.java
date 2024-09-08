package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;
import com.app.beans.Student;
import com.app.beans.User;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	User user = (User) context.getBean("user");
    	Student stu = (Student) context.getBean("stu");
    	Employee emp = (Employee) context.getBean("emp");
    	
    	
    	System.out.println(user);
    	System.out.println(stu);
    	System.out.println(emp);
    	
    	/* 
    	 Only user and student's init and destroy method will be called because I have mentioned in beans tag the method name. 
    	 I have written different init and destroy method name in employee class so it will not be invoked.
    	*/
    	
    	
    	((AbstractApplicationContext)context).close();
    }
}
