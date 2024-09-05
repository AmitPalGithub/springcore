package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {
	
//	@Autowired
//	private LogisticService logisticService;
	

//	@Autowired
//	@Qualifier("bdrt")
//	private LogisticService logisticService;

//	@Autowired
//	@Qualifier("blued")
//	private LogisticService logisticService;
	
	@Autowired
	private LogisticService logisticService;
	
	public void setLogisticService(LogisticService logisticService) {
		this.logisticService = logisticService;
	}
	
	
	public void trackOrder(int orderId) {
		logisticService.tracOrderLocation(orderId);
	}

}
