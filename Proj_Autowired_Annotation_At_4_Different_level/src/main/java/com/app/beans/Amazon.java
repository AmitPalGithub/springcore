package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {
	
	
	private LogisticService logisticService;
	
	// @Autowired at the field level
	
//	@Autowired
//	private LogisticService logisticService;
	
	
	// @Autowired at the setter level
	
//	@Autowired
//	@Qualifier("exprs")
//	public void setLogisticService(LogisticService logisticService) {
//		this.logisticService = logisticService;
//	}
	
	
	// @Autowired at the constructor level
	
//	@Autowired
//	public Amazon(@Qualifier("bludrt") LogisticService logisticService)
//	{
//		this.logisticService = logisticService;
//	}
	
	
	// @Autowired at the arbitrary/random level
	@Autowired
	@Qualifier("bludrt")
	public void deliveryPartner(LogisticService logisticService) {
		this.logisticService = logisticService;
	}
	
	
	
	public void trackOrder(int orderId) {
		logisticService.tracOrderLocation(orderId);
	}

}
