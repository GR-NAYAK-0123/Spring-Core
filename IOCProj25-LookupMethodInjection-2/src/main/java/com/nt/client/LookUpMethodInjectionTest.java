package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Customer;

public class LookUpMethodInjectionTest {

	public static void main(String[] args) {
		//Creation of IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Getting the object of the target class (But here we got the Object of the sub class of the target class bcz target class is an abstract)
		Customer cust = ctx.getBean("customer", Customer.class);
		//Invoking the business methods
		cust.working();
		cust.sleeping();
		cust.shooping();
		
		//closing the IOC Container
		ctx.close();
	}

}
