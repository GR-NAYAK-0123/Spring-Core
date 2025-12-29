package com.nt.model;

public class Customer {
	private Integer cno;
	private String cname;
	private String cadd;
	private Double billamount;
	private Double discount;
	private Double finalamount;
	
	//setters and getters 
	
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public Double getBillamount() {
		return billamount;
	}
	public void setBillamount(Double billamount) {
		this.billamount = billamount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(Double finalamount) {
		this.finalamount = finalamount;
	}

}
