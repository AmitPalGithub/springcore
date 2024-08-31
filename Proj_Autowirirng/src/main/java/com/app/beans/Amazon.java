package com.app.beans;

public class Amazon {
	
	private LogisticService logisticService;

	public void setLogisticService(LogisticService logisticService) {
		this.logisticService = logisticService;
	}

	public void deliveryService(int orderId) {
		
		logisticService.logisticService(orderId);
	}
	

}
