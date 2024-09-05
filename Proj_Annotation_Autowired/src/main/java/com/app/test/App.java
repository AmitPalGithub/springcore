package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;


public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Amazon amazon = (Amazon) context.getBean("amazon");
    	
    	amazon.trackOrder(45678);
    }
}
