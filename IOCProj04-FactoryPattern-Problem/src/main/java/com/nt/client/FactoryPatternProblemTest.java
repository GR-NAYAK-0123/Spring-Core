package com.nt.client;

import com.nt.cmps.AadharDetails;
import com.nt.cmps.Employee;
import com.nt.cmps.Person;
import com.nt.cmps.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		AadharDetails details = new AadharDetails(975092562392L, 23, 7008800525L); //dependent class object
		Person st = new Student("Raja", "Europe", details, 20, "Java"); // Target class object having dependent class object
		System.out.println(st);
		
		System.out.println("====================================");
		
		AadharDetails details1 = new AadharDetails(97509256232L, 33, 2008800525L); //dependent class object
		Person emp = new Employee("Conor", "Ireland", details1, 21, "UFC"); // Target class object having dependent class object
		System.out.println(emp);
	}

}
