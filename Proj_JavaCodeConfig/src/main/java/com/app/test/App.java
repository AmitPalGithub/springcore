package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.beans.Holidays;
import com.app.config.MyAppConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
       
       Holidays holidays = (Holidays) context.getBean("holiday");
       holidays.checkHoliday();
    }
}
