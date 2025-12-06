package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependecyInjectionTest {

	public static void main(String[] args) {
		// Creates the IOC COntainer
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Object obj = ctx.getBean("sf");   // Here we get the Target class Object by using "getBean()" 
		
		SeasonFinder finder = (SeasonFinder) obj;  //Here Type casting is done
		
		String month = finder.nameOfSeason();   // Getting the month name from the "nameOfSeason" method
		
		System.out.println("Season Name : "+month);  // Printing the month name
		
//		System.out.println(time);
		
		ctx.close();      // closed the IOC  container

	}  // main

} //class
