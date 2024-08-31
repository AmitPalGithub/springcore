package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class Test 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
       
//       Amazon amazon = (Amazon) context.getBean("amazon");
//       amazon.deliveryService(6789);

       Amazon amazon2 = (Amazon) context.getBean("amazon2");
       amazon2.deliveryService(67789);
      
       
    }
}
