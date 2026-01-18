package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Person;
//import com.nt.sbeans.VoterCard;

public class EligibleForVoteTest_Declarative {

	public static void main(String[] args) {
		//Create the IOC Container with try with resource
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml")){
			//VoterCard voter = ctx.getBean("voter", VoterCard.class);
			
			//Calling the business method
			/*String msg = voter.eligibilityForVote();
			System.out.println(msg);*/
			
			Person p1 = ctx.getBean("p2", Person.class);      // Here I applied all 3 types of life cycles into one spring bean
			String msg = p1.eligible();
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
