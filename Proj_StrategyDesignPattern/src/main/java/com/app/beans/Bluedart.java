package com.app.beans;

public class Bluedart implements LogisticService {

	
	public void checkDelhiveryStatus(int orderId) {
		System.out.println("Your order id is "+ orderId+" and it will be delivered by today ");

	}

	
	public void returnProduct(int orderId) {

		System.out.println("We have accepted your order with orderId "+orderId+" product will be picked up by Bluedart courier ");
		System.out.println("Your order id is "+ orderId+" and it will be delivered by today ");

	}

}
