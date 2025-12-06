package com.nt.sbeans;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	//Field Injection
	@Autowired
	private LocalDate date;
	
	//Business method
	public String season() {
		int month = date.getMonthValue();
		
		if(month >= 1 && month < 4)
			return "winter";
		else if(month >= 5 && month < 8)
			return "summer";
		else
			return "Rainy";
	}
}
