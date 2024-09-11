package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.beans.BankLoanInterestCalculator;
import com.app.config.MyAppConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
        
        BankLoanInterestCalculator loanCal = (BankLoanInterestCalculator) context.getBean("loanCal");
        
        float ci = loanCal.calLoanInterest(124, 8, 5);
        System.out.println(ci);
    }
}
