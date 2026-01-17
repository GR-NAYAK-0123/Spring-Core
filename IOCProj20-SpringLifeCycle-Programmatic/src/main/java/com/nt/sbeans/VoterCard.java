package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterCard implements InitializingBean, DisposableBean{
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
	
	//business method
	public String eligibilityForVote() {
		System.out.println("Date : "+dov);
		if(age >= 18)
			return "Person with name : "+name+" and having age : "+age+" eligible for vote";
		else
			return "Person with name : "+name+" and having age : "+age+" is not eligible for vote";
	}

	//This method is spring supplied method and here we override those method with our logic
	@Override
	public void destroy() throws Exception {
		System.out.println("VoterCard.destroy()");
		name = null;
		age = null;
		dov = null;
	}

	//This method is spring supplied method and here we override those method with our logic
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterCard.afterPropertiesSet()");
		dov = new Date();
		if(age <= 0 || name == null || age == null)
			throw new IllegalArgumentException("Invalid input");
	}
	
}
