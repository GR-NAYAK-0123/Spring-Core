package com.nt.client;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.controller.PersonController;
import com.nt.model.Person;

public class PersonRealTimeTest {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Person Id : ");
		Integer id = sc.nextInt();
		System.out.println("Enter the Person Name : ");
		String name = sc.next();
		System.out.println("Enter the Person Address : ");
		String addrs = sc.next();
		System.out.println("Enter the Person Basic Salary : ");
		Double bsal = sc.nextDouble();
		System.out.println("Enter the tax : ");
		Double tax = sc.nextDouble();
		
		sc.close();
		
		//Creating the Person Object
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setAddrs(addrs);
		person.setBsal(bsal);
		person.setTax(tax);
		
		//Creating the IOC Container
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			PersonController controller = ctx.getBean("person-controller", PersonController.class);
			String resultMsg = controller.personRegistration(person);
			System.out.println(resultMsg);
		}
		catch(SQLException se) {
			System.out.println("Problem happened at Database");
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	} //main

} //class
