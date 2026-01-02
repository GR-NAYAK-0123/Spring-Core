package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart : 0-Param Constructor");
	}
	
	@Override
	public String deliver(int oid) {
		
		return "order id : "+oid+" order is set for delivery using BlueDart Courier Service";
	}

}
