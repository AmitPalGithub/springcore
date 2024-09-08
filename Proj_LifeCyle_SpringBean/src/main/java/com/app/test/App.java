package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	User user = (User) context.getBean("user");
    	
    	System.out.println(user);
    	
    	((AbstractApplicationContext)context).close();
    	
    	System.out.println(user);
    }
}
