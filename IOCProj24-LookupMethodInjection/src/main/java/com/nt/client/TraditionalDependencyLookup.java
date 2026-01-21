package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class TraditionalDependencyLookup {

	public static void main(String[] args) {
		//Creating the IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Getting the target class object by using dependency lookup
		Cricketer crckt = ctx.getBean("crkt", Cricketer.class); /*Here we are not getting the Cricketer class object because it is an abstract class but 
																                                             we are just getting it's sub class object which is created by the IOC container as the
																                                             In memory proxy */
		crckt.bowling();
		crckt.fielding();
		crckt.batting();
		/*System.out.println("--------------------------------------");
		crckt.batting();*/
		
		ctx.close();
	}

}
