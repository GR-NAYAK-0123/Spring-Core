package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;

//import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		//Creating the IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipkart fpkt = (Flipkart) ctx.getBean("fpkt");
		
		//invoke the business method
		String resultMsg = fpkt.shopping(new String[] {"Kurta-Pajama", "Shoes", "Watch"}, 
				                                                              new double[] {2000.0, 1000.0, 3000.0});
		System.out.println(resultMsg);
		
		ctx.close();
	}

}
