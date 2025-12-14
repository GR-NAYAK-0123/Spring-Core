package com.nt.comps;

public final class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC : 0-Param Constructor");
	}
	
	@Override
	public String deliver(int oid) {
		
		return "order id : "+oid+" order is set for delivery using DTDC Courier Service";
	}

}
