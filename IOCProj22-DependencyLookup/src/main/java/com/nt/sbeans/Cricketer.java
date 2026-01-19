package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("crkt")
@PropertySource("com/nt/commons/Info.properties")
public class Cricketer {
	@Value("${plyr.name}")
	private String name;
	@Value("${plyr.id}")
	private Integer id;
	
	public Cricketer() {
		System.out.println("Cricketer: 0-Param constructor");	
    }
	
	public void bowling() {
		System.out.println(name+" is bowling");
	}
	
	public void fielding() {
		System.out.println(name+" is fielding");
	}
	
	public void batting() {
		System.out.println("Cricketer.batting()");
		//Creating the extra IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Logic for dependency lookup
		CricketerBat bat = ctx.getBean("bat", CricketerBat.class);
		int runs = bat.score();
		System.out.println(name+" scores : "+runs);
		ctx.close();
	}
}
