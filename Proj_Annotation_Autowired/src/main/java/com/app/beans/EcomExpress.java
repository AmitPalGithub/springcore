package com.app.beans;

public class EcomExpress implements LogisticService {

	
	public void tracOrderLocation(int orderId) {
		System.out.println("Your order id: "+ orderId + " is reached to nearest hub, it will be delivered by tomorrow by ecomexpress.");

	}

}
