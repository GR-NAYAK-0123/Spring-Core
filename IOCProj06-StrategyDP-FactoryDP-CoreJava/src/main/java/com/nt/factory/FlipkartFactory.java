package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	//static factory method having logic to create Flipkart object having the given dependent object
	public static Flipkart getInstances(String courierType) {
		Courier courier = null;
		if(courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		}
		else if(courierType.equalsIgnoreCase("bluedart")) {
			courier = new BlueDart();
		}
		else if(courierType.equalsIgnoreCase("dhl")) {
			courier = new DHL();
		}
		else {
			throw new IllegalArgumentException("Invalid courierType");
		}
		//Create target class object
		Flipkart fpkt = new Flipkart();
		//Assigning dependent class object to target class object
		fpkt.setCourier(courier);
		
		return fpkt;
	}
}
