package com.app.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;


@Component("loanCalCi")
public class BankLoanInterestCalculator_CI implements MethodReplacer{

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		System.out.println("loan interest:: ci");
		
		float p = (float)args[0];
		float r = (float)args[1];
		float t = (float)args[2];
		
		float ci = (float)(p*Math.pow((1+r/100), t)-p);
		return ci;
	}

}
