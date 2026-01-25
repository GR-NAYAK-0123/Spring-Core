package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class Customer {
	private String name;
	private Integer id;
	
	public Customer() {
		System.out.println("Customer: 0-Param constructor");
	}
	
	public void setName(String name) {
		System.out.println("Customer.setName()");
		this.name = name;
	}
	public void setId(Integer id) {
		System.out.println("Customer.setId()");
		this.id = id;
	}
	
	public void working() {
		System.out.println(name+" with id : "+id+" working");
	}
	
	public void sleeping() {
		System.out.println(name+" with id : "+id+" sleeping");
	}
	
	public void shooping() {
		//Here we got the StyleBazar Object
		StyleBazar bazar = getStyleBazar();
		Double amount = bazar.amount();
		System.out.println("Customer : "+name+" purchased product of Rs - "+amount);
	}
	
	@Lookup
	public abstract StyleBazar getStyleBazar();
}
