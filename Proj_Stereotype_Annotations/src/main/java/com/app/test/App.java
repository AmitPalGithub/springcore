package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Student stu = context.getBean("student", Student.class);
        stu.setName("amit pal");
        stu.setRollNo(22);
        System.out.println(stu);
    }
}
