package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	//HAS-A Property
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0 - Param Constructor");
	}

	//Setter method for injection (Assigning dependent class obj to target class obj)
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
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
		return Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" ,bill amount : "+total+"--->"+msg;
	}
	
}
