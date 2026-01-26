package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.StyleBazar;

public class MethodReplacerTest {

	public static void main(String[] args) {
		//Creating the IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Getting the target class object
		StyleBazar bazar = ctx.getBean("shop", StyleBazar.class);
		//Calling the business method by using the target class object
		Double finalBillAmount = bazar.billAmount(2000.0, 18.0);
		System.out.println("The Final Bill Amount : "+finalBillAmount);
		
		//Closing the container
		ctx.close();

	}

}
