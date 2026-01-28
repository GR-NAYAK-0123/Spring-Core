package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class CodeDrivenConfigurationTest {

	public static void main(String[] args) {
		//Creating the IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator wmg = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);
		
		//closing the container
		ctx.close();
	}

}
