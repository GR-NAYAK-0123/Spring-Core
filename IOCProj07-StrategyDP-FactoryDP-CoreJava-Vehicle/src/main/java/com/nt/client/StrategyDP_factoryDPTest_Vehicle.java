package com.nt.client;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDP_factoryDPTest_Vehicle {

	public static void main(String[] args) {
		//Using VehicleFactory class to get the Vehicle class object having the dependent class object
		Vehicle vhl = VehicleFactory.getInstances("eengine");
		
		//Invoking the business method
		String resultMsg = vhl.travelling(200, 110);
		
		System.out.println(resultMsg);

	}

}
