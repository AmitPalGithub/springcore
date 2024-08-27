package com.app.beans;

public class Amazon {
	
	
	private LogisticService logisticService;
	
	
	public Amazon(LogisticService logisticService) {
		
		this.logisticService=logisticService;
	}
	
	public void checkDeliveryStatus(int orderId) {
		
		logisticService.checkDelhiveryStatus(orderId);
	}
	
	public void returnOrder(int orderId) {
		
		logisticService.returnProduct(orderId);
	}

}
