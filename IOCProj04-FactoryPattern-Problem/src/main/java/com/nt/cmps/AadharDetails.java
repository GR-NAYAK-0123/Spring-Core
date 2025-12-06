package com.nt.cmps;

public class AadharDetails {
	private long aadharNo;
	private int age;
	private long mobileNo;
	
	
	public AadharDetails(long aadharNo, int age, long mobileNo) {
		System.out.println("AadharDetails :: 3 - Param Constructor");
		this.aadharNo = aadharNo;
		this.age = age;
		this.mobileNo = mobileNo;
	}


	// alt + shift + s  [ For getting toString() ]
	@Override
	public String toString() {
		return "AadharDetails [aadharNo=" + aadharNo + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
