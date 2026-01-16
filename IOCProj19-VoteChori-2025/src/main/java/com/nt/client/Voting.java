package com.nt.client;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.PersonVote_Controller;
import com.nt.model.Person;

public class Voting {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("If you want to give the vote press - 1 or press - 0 (for NOTA)");
		int vote = sc.nextInt();
		
		Person person = new Person();
		
		if(vote == 1) {
			System.out.println("|--------------------------------------------------------|");
			System.out.println("|BJP   --------------------------->           1               |");
			System.out.println("|CONG   --------------------------->           2          |");
			System.out.println("|BJD   --------------------------->           3               |");
			System.out.println("|--------------------------------------------------------|");
			
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			sc.close();
			
			switch (choice) {
			         case 1 : person.setBjp(1);
			                        break;
			         case 2 : person.setBjp(1);
			                        break;
			         case 3 : person.setBjd(1);
			                        break;
			         default : person.setBjp(1);
			}
			
			try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml")){
				PersonVote_Controller controller = ctx.getBean("person-controller", PersonVote_Controller.class);
				String result = controller.voting(person);
				System.out.println(result);
			}
			catch(SQLException se) {
				System.out.println("Failed at data base");
				se.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Thank you for NOT supporting !!!");
		}

	}  //main

} //class
