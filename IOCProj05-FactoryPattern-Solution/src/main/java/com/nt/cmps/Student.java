package com.nt.cmps;

public class Student extends Person {
	private int stuId;
	private String course;

	public Student(String name, String address, AadharDetails aadhar, int stuId, String course) {
		super(name, address, aadhar);
		System.out.println("Student :: 5-Param Constructor");
		this.stuId = stuId;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", course=" + course + "]-->"+super.toString();
	}
	
}
