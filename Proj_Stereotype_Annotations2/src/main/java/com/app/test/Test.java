package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Employee emp = context.getBean("employee", Employee.class);
        
        Employee emp2 = context.getBean("employee", Employee.class);
        
        System.out.println(emp);
        
        

   
        
        
    }
}
