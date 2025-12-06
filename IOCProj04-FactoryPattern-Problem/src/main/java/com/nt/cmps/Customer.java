package com.nt.cmps;

public class Customer extends Person {
	private double billAmt;
	private String txId;

	public Customer(String name, String address, AadharDetails aadhar, double billAmt, String txId) {
		super(name, address, aadhar);
		System.out.println("Customer :: 5-Param Constructor");
		this.billAmt = billAmt;
		this.txId = txId;
	}

	@Override
	public String toString() {
		return "Customer [billAmt=" + billAmt + ", txId=" + txId + "]-->"+super.toString();
	}
	
}
