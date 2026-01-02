package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("fpkt")
public final class Flipkart {
	//HAS-A Property
	//@Autowired
	//@Qualifier("imp")   // Here the id is given as alias for the class we have got from the properties file
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0 - Param Constructor");
	}

	public void setCourier(Courier courier) {    // Here i did the setter injection with the help of xml configuration and for that we don't need any @Autowired and @Component
		this.courier = courier;
	}
	//b method
	public String shopping(String items[], double prices[]) {
		//Calculate bill amount
		double total = 0.0;
		for(double p : prices)
			total += p;
		//generate random number as order id
		int oid = new Random().nextInt(1000);
		//Use courier
		String msg = courier.deliver(oid);
		courier.msg();
		return Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" ,bill amount : "+total+"--->"+msg;
	}
	
}
