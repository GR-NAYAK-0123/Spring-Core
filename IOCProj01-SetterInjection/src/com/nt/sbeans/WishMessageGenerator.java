//WishMessageGenerator.java

package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0-param constructor");
	}
	
	//setter method for setter injection
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime = dateTime;
	}
	
	//business method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		//get current hour of the day
		int hour = dateTime.getHour(); 
		
		//generate the wish message
		if(hour < 12)
			return "Good Morning : "+user;
		else if(hour >= 12 && hour < 16)
			return "Good Afernoon : "+user;
		else if(hour >= 16 && hour < 20)
			return "Good Evening : "+user;
		else
			return "Good Night : "+user;
	}
	
	
}
