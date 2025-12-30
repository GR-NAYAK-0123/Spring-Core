package com.nt.client;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Controller.StudentController;
import com.nt.Model.Student;

public class StudentTest {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		//Getting the input from the end user
		System.out.println("Enter the Student Roll Number : ");
		Integer rollno = sc.nextInt();
		System.out.println("Enter the Student Name : ");
		String name = sc.next();
		System.out.println("Enter the Student Address : ");
		String addrs = sc.next();
		System.out.println("Enter the Java Score : ");
		Double java = sc.nextDouble();
		System.out.println("Enter the Spring Score : ");
		Double spring  = sc.nextDouble();
		
		sc.close();
		
		//Creating the student object
		Student student = new Student();
		//Setting the above value to the student class object
		student.setRollno(rollno);
		student.setName(name);
		student.setAddrs(addrs);
		student.setJava(java);
		student.setSpring(spring);
		
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
			StudentController controller = ctx.getBean("student-controller", StudentController.class);
			String resultMsg = controller.studentRegistration(student);
			System.out.println(resultMsg);
		}
		catch (SQLException se) {
			System.out.println("The registration failed due to some database problem");
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	} //main

} //class
