package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class Test {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/resources/context.xml");
		
		Amazon amazon = (Amazon) context.getBean("amazon");
		amazon.returnOrder(45678);
	}

}
