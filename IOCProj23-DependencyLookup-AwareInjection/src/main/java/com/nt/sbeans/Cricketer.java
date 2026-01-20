package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("crkt")
@PropertySource("com/nt/commons/Info.properties")
public class Cricketer implements ApplicationContextAware{
	@Value("${plyr.name}")
	private String name;
	@Value("${plyr.id}")
	private Integer id;
	
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx = applicationContext;
	}
	
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
		//Logic for dependency lookup
		CricketerBat bat = ctx.getBean("bat", CricketerBat.class);
		int runs = bat.score();
		System.out.println(name+" scores : "+runs);
	}

	
}
