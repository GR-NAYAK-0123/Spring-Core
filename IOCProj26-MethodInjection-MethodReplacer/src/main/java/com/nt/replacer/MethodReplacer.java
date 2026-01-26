package com.nt.replacer;

import java.lang.reflect.Method;

public class MethodReplacer implements org.springframework.beans.factory.support.MethodReplacer {

	//Here I wrote for calculating the bill amount with having some discount
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("MethodReplacer.reimplement()");
		Double amount = (Double)args[0];
		Double gst = (Double)args[1];
		Double discount = 5.0;
		return (amount += (amount * (gst/100))) - ((Double)args[0] * (discount/100));
	}

}
