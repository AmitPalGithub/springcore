package com.springboot.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("user")
public class User {
	
	@Value("${user.info.id}")
	private int id;
	
	@Value("${user.info.name}")
	private String name;

	@Value("${user.info.email}")
	private String email;
	

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
