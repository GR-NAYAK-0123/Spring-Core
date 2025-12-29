package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.CustomerController;
import com.nt.model.Customer;

public class RealTimeDITest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Getting the Customer details from the End User
		System.out.println("Enter the Customer Serial Number : ");
		Integer serialNo = sc.nextInt();
		System.out.println("Enter the Customer Name : ");
		String name = sc.next();
		System.out.println("Enter the Customer Address : ");
		String addr = sc.next();
		System.out.println("Enter the Bill Amount : ");
		Double billAmount = sc.nextDouble();
		System.out.println("Enter the discount Amount : ");
		Double discountAmount = sc.nextDouble();
		
		//Created the customer object
		Customer customer = new Customer();
		
		//Setting the the end user details to the  customer object
		customer.setCno(serialNo);
		customer.setCname(name);
		customer.setCadd(addr);
		customer.setBillamount(billAmount);
		customer.setDiscount(discountAmount);
		
		//close the Scanner
		sc.close();
		
		//Create the IOC Container
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
		
		//get the target class (Controller class) by using the id name and the java.lang.Class Object
		CustomerController controller = ctx.getBean("custController", CustomerController.class);
		
			String result = controller.process(customer);
			System.out.println(result);
		}
		catch(SQLException se) {
			System.out.println("Registration failed beacuse of some problem ocuurs at Database");
			se.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Registration is failed!!!!");
			e.printStackTrace();
		}
		
	} //main

} //class
