package com.nt.model;

public class Employee {
	private Integer id;
	private String name;
	private String addrs;
	private Double basicSal;
	private Double tax;
	private Double finalSal;
	
	
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
	public Double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(Double basicSal) {
		this.basicSal = basicSal;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getFinalSal() {
		return finalSal;
	}
	public void setFinalSal(Double finalSal) {
		this.finalSal = finalSal;
	}
	
	
}
