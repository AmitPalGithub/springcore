package com.app.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.app")
public class MyAppConfig {
	
	
	@Bean(name="holidayDate")
	public Date date() {
		
		return new Date();
	}

}
