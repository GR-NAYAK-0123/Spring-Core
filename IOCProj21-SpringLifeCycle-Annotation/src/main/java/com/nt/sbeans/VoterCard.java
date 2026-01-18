package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource(value="com/nt/commons/Info.properties")
public class VoterCard {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	private Date dov;
	
	public VoterCard() {
		System.out.println("VoterCard: 0 - Param Constructor");
	}
	
	//business method
	public String eligibilityForVote() {
		System.out.println("Date : "+dov);
		if(age >= 18)
			return "Person with name : "+name+" and having age : "+age+" eligible for vote";
		else
			return "Person with name : "+name+" and having age : "+age+" is not eligible for vote";
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("VoterCard.myDestroy()");
		name = null;
		age = null;
		dov = null;
	}

	@PostConstruct
	public void myInit() {
		System.out.println("VoterCard.myInit()");
		dov = new Date();
		if(age <= 0 || name == null || age == null)
			throw new IllegalArgumentException("Invalid input");
	}
	
}
