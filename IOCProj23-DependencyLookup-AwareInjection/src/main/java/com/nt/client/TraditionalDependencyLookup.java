package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class TraditionalDependencyLookup {

	public static void main(String[] args) {
		//Creating the IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Getting the target class object by using dependency lookup
		Cricketer crckt = ctx.getBean("crkt", Cricketer.class);
		
		//Calling the business methods of Cricketer class
		crckt.bowling();
		crckt.fielding();
		crckt.batting();
		/*System.out.println("--------------------------------------");
		crckt.batting();*/
		
		ctx.close();
	}

}
