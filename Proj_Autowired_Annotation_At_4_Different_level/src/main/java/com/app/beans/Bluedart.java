package com.app.beans;

public class Bluedart implements LogisticService {

	@Override
	public void tracOrderLocation(int orderId) {
		System.out.println("Your order id: "+ orderId + " is reached to nearest hub, it will be delivered by tomorrow by bluedart.");


	}

}
