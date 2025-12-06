package com.nt.cmps;

public class Employee extends Person {
	private int empid;
	private String desg;

	public Employee(String name, String address, AadharDetails aadhar, int empid, String desg) {
		super(name, address, aadhar);
		System.out.println("Employee :: 5-Param Constructor");
		this.empid = empid;
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", desg=" + desg + "]-->"+super.toString();
	}
	
}
