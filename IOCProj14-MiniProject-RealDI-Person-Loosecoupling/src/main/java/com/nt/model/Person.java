package com.nt.model;

public class Person {
	private Integer id;
	private String name;
	private String addrs;
	private Double bsal;
	private Double tax;
	private Double finalsal;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Double getBsal() {
		return bsal;
	}
	public void setBsal(Double bsal) {
		this.bsal = bsal;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getFinalsal() {
		return finalsal;
	}
	public void setFinalsal(Double finalsal) {
		this.finalsal = finalsal;
	}
	
	
}
