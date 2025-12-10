package com.nt.cmps;

public abstract class Person {
	private String name;
	private String address;
	private AadharDetails aadhar;
	
	
	public Person(String name, String address, AadharDetails aadhar) {
		System.out.println("Person :: 3 - Param constructor");
		this.name = name;
		this.address = address;
		this.aadhar = aadhar;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", aadhar=" + aadhar + "]";
	}
	
	
}
