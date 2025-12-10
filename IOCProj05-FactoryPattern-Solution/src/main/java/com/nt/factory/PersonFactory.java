package com.nt.factory;

import com.nt.cmps.AadharDetails;
import com.nt.cmps.Customer;
import com.nt.cmps.Employee;
import com.nt.cmps.Person;

public class PersonFactory {
	
	//public static Factory method creating and returning One Person(AC) sub class Object
	// This method contains factory pattern logic
	public static Person getInstance(String personType) {
		Person per = null;
		
		if(personType.equalsIgnoreCase("emp")) {
			AadharDetails details = new AadharDetails(64663478L, 32, 5638568L); //dependent class object
			per = new Employee("Rhonda", "USA", details, 101, "Champion"); // target class object
		}
		else if(personType.equalsIgnoreCase("cust")) {
			AadharDetails details1 = new AadharDetails(6466342178L, 36, 563854368L);
			per = new Customer("Conor", "Ireland", details1, 10192.0, "Notorious");
		}
		else if(personType.equalsIgnoreCase("stud")) {
			AadharDetails details2 = new AadharDetails(98663478L, 23, 9038568L);
			per = new Employee("Raja", "Europe", details2, 20, "Java");
		}
		else {
			throw new IllegalArgumentException("Invalid PersonType");
		}
		return per;
	}
}
