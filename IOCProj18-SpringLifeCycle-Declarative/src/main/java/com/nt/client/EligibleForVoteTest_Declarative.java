package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VoterCard;

public class EligibleForVoteTest_Declarative {

	public static void main(String[] args) {
		//Create the IOC Container with try with resource
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml")){
			VoterCard voter = ctx.getBean("voter", VoterCard.class);
			
			//Calling the business method
			String msg = voter.eligibilityForVote();
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
