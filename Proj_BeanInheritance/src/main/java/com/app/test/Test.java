package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Car;

public class Test {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) context.getBean("car1");
		System.out.println(car);
		
		
		System.out.println("--------------------------");
		
		
		Car carr = (Car) context.getBean("car3");
		System.out.println(carr);
	}

}
