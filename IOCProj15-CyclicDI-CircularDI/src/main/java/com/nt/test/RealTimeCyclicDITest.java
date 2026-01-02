package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.A;

public class RealTimeCyclicDITest {

	public static void main(String[] args) {
		//Create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		A a = ctx.getBean("a", A.class);
		System.out.println(a);
		//close the IOC container
		ctx.close();
	}

}
