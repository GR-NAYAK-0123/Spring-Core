package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		//Use factory pattern class to get Flipkart class object having our choice dependent class object
		Flipkart fpkt = FlipkartFactory.getInstances("dtdc");
		
		//invoke the business method
		String resultMsg = fpkt.shopping(new String[] {"Kurta-Pajama", "Shoes", "Watch"}, 
				                                                              new double[] {2000.0, 1000.0, 3000.0});
		System.out.println(resultMsg);
	}

}
