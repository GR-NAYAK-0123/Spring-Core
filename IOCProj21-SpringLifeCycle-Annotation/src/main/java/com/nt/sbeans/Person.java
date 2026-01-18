package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/*import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;*/

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component("p2")
//@PropertySource(value = "com/nt/commons/Info.properties")
public class Person implements InitializingBean, DisposableBean{
	private String name;
	//@Value("${voter.age}")
	private Integer age;
	
	private Double salary;

	private Date dov;
	
	public Person() {
		System.out.println("Person.Person()");
	}
	
	public void setAge(Integer age) {
		System.out.println("Person.setAge()");
		this.age = age;
	}



	public void setSalary(Double salary) {
		System.out.println("Person.setSalary()");
		this.salary = salary;
	}

	public void setName(String name) {
		System.out.println("Person.setName()");
		this.name = name;
	}
	
	public String eligible() {
		System.out.println("Person.eligible()");
		System.out.println(dov);
		if(age <= 18 || age == null)
			return "Person Name : "+name+" and with age : "+age+" and salary : "+salary+" is not eligible for vote";
		else 
			return "Person Name : "+name+" and with age : "+age+" is eligible for vote";
	}
	
	public void myInit() {
		System.out.println("Person.myInit()");
		dov = new Date();
		if(age < 0 || name == null)
			throw new IllegalArgumentException("Invalid Information");
	}
	
	public void myDestroy() {
		System.out.println("Person.myDestroy()");
		name = null;
		age = null;
		salary = null;
		dov = null;
	}
	
	@PostConstruct
	public void myInitForAnnotation() {
		System.out.println("Person.myInitForAnnotation()");
		dov = new Date();
		if(age <= 0 || name == null)
			throw new IllegalArgumentException("Invalid Information");
	}
	
	@PreDestroy
	public void myDestroyForAnnotation() {
		System.out.println("Person.myDestroyForAnnotation()");
		name = null;
		age = null;
		salary = null;
		dov = null;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Person.destroy()");
		name = null;
		age = null;
		salary = null;
		dov = null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person.afterPropertiesSet()");
		dov = new Date();
		if(age <= 0 || name == null)
			throw new IllegalArgumentException("Invalid Information");
	}
	
}
