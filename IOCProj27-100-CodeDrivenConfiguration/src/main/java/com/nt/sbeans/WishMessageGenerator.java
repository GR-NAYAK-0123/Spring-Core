package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	private LocalDate date;

	@Autowired
	public void setLd(LocalDate ld) {
		this.date = ld;
	}

	@Override
	public String toString() {
		return "Today [Date =" + date + "]";
	}
	
}
