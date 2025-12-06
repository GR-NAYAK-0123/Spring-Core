package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// Creation of IOC Container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		// Getting the target class object
		Object obj = ctx.getBean("sf");
		
		//Type casting the target class object
		SeasonFinder finder = (SeasonFinder) obj;
		
		//Calling the business method
		String season = finder.season();
		
		//Printing the result
		System.out.println("Season : "+season);
		
		//Closing the IOC Container
		ctx.close();
	}

}
