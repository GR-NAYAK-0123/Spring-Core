package com.nt.sbeans;

//import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("crkt")
@PropertySource("com/nt/commons/Info.properties")
public abstract class Cricketer {
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
	
	@Lookup
	public abstract CricketerBat getCricketBat();   // Lookup method injection
	
	public void batting() {
		System.out.println("Cricketer.batting()");
		//Calling the getCricketBat method for getting the dependent class object
		CricketerBat bat = getCricketBat();
		int runs = bat.score();
		System.out.println(name+" scores : "+runs);
	}

	
}
