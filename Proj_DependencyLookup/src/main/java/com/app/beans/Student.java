package com.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	
	private ZoomApi zoomApi;

	public void attendance() {
		System.out.println("attendance done");
	}
	
	public void attendingLiveClass() {
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		zoomApi= (ZoomApi) context.getBean("zoom");
		zoomApi.liveStreaming();
	}
	

}
