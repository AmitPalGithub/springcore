package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("holiday")
public class Holidays {
	
	@Autowired
	@Qualifier("holidayDate")
	private Date date;
	
	
	public void checkHoliday() {
		
		if(date.getMonth()==8) {
			if(date.getDate()==10) {
				System.out.println("no leave in the given date in aug");
			}
			else {
				System.out.println("today is leave day....weekend");
			}
		}
	}

}
