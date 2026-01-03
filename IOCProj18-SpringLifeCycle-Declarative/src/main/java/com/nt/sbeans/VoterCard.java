package com.nt.sbeans;

import java.util.Date;

public class VoterCard {
	private String name;
	private Integer age;
	private Date dov;
	
	public VoterCard() {
		System.out.println("VoterCard: 0 - Param Constructor");
	}

	public void setName(String name) {
		System.out.println("VoterCard.setName()");
		this.name = name;
	}

	public void setAge(Integer age) {
		System.out.println("VoterCard.setAge()");
		this.age = age;
	}
	
	//Instantiation
	public void myInit() {
		System.out.println("VoterCard.myInit()");
		dov = new Date();
		if(age <= 0 || name == null || age == null)
			throw new IllegalArgumentException("Invalid input");
	}
	
	//Destruction
	public void myDestroy() {
		System.out.println("VoterCard.myDestroy()");
		name = null;
		age = null;
		dov = null;
	}
	
	//business method
	public String eligibilityForVote() {
		System.out.println("Date : "+dov);
		if(age >= 18)
			return "Person with name : "+name+" and having age : "+age+" eligible for vote";
		else
			return "Person with name : "+name+" and having age : "+age+" is not eligible for vote";
	}
	
}
