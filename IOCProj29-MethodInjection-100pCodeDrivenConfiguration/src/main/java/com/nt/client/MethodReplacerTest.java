package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.StyleBazar;

public class MethodReplacerTest {

	public static void main(String[] args) {
		//Creating the IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//Getting the target class object
		StyleBazar bazar = ctx.getBean("shop", StyleBazar.class);
		//Calling the business method by using the target class object
		Double finalBillAmount = bazar.billAmount(5000.0, 18.0);
		System.out.println("The Final Bill Amount : "+finalBillAmount);
		
		//Closing the container
		ctx.close();

	}

}
