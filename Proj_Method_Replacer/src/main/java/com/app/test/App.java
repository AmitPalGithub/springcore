package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.BankLoanInterestCalculator;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
    	
    	BankLoanInterestCalculator  loanCal = (BankLoanInterestCalculator) context.getBean("loanCal");
    	
    	float si = loanCal.calLoanInterest(1088, 13, 2);
    	System.out.println(si);
    }
}
