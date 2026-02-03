package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class I18n_Test {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);
				         //Creating the IOC Container
				          AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			//Taking input from the end user
			System.out.println("Enter the lang Code : ");
			String lang = sc.next();
			System.out.println("Enter the country code : ");
			String country = sc.next();
			
			//Creating the Locale object with above data
			Locale locale = new Locale(lang, country);
			
			String msg1 = ctx.getMessage("greet.msg", new Object[] {}, locale);
			String msg2 = ctx.getMessage("bye.msg", new Object[] {}, locale);
			
			System.out.println(msg1);
			System.out.println(msg2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
