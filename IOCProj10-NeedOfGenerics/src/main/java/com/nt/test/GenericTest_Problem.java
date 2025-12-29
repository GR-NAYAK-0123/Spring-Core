package com.nt.test;

public class GenericTest_Problem {
	
	public static Person getInstance(String type) {
		if(type.equalsIgnoreCase("cust")) {
			return new Customer();
		}
		else if(type.equalsIgnoreCase("emp")) {
			return new Employee();
		}
		else {
			throw new IllegalArgumentException("Invalid type");
		}
	}

	public static void main(String[] args) {
		Employee emp = (Employee) getInstance("emp");
		System.out.println(emp);
		Person per = getInstance("cust");
		System.out.println(per);
	}

}
