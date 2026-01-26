package com.nt.sbeans;

public class StyleBazar {
	
	//This is the business method for calculating the final bill amount including GST and without any discount
	public Double billAmount(Double amount, Double gst) {
		return amount += (amount * (gst/100));
	}
}
