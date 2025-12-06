package com.nt.sbeans;

import java.time.LocalDate;
//import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")                 // Here we are provide instruction to the IOC Container to make this class as Spring bean
public class SeasonFinder {
	private LocalDate date;   
	//private LocalDateTime time;

	@Autowired                                              // This the setter Injection 
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String nameOfSeason() {
		int month = date.getMonthValue();
		
		
		if(month > 0 && month <= 4) 
			return "Summer";
		else if(month > 4 && month <= 8)
			return "Rainy";
		else
			return "Winter";
	}
	
//	public int todayTime() {
//		int hour = time.getHour();
//		return hour;
//	}
}
