package com.app.beans;

public class BankLoanInterestCalculator {
	
	
	public float calLoanInterest(float p, float r, float t) {
		
		System.out.println("loan interest:: si");
		float si=(p*r*t)/100;
		return si;
		
	}

}
