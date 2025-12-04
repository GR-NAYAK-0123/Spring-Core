package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInejctionTest {

	public static void main(String[] args) {
		//creation of IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Object obj = ctx.getBean("wmg"); // Getting the object of the target class
		WishMessageGenerator msg = (WishMessageGenerator)obj;  // Here just type casting the object to it's respective class 
		
		String result = msg.generateWishMessage("Raja");  // Calls the method for getting the WishMessage
		
		System.out.println(result);  //Printing the result
		
		ctx.close();   // Closing IOC container

	}  //main

} // class
