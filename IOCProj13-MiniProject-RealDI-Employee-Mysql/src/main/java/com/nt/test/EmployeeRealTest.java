package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

public class EmployeeRealTest {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Name : ");
		String name = sc.next();
		System.out.println("Enter the Employee Address : ");
		String addrs = sc.next();
		System.out.println("Enter the basic Salary : ");
		Double basicSal = sc.nextDouble();
		System.out.println("Enter the tax Percentage : ");
		Double tax = sc.nextDouble();
		
		sc.close();
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAddrs(addrs);
		emp.setBasicSal(basicSal);
		emp.setTax(tax);
		
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
			EmployeeController controller = ctx.getBean("empController", EmployeeController.class);
			String resultMsg = controller.employeeRegistration(emp);
			System.out.println(resultMsg);
		}
		catch(SQLException se) {
			System.out.println("Problem arrived at Database");
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	} //main

} //class
