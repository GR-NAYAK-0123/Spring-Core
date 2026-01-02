package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a")
public class A {
	@Autowired
	private B b;   // Here we are achieving the cyclic DI with field injection
	
	/*//@Autowired
	//	public A(B b) {             //Here by using constructor injection the cyclic DI is not possible
	//		this.b = b;
	//		System.out.println("A: 1-param constructor");
	//	}
	*/
	@Override
	public String toString() {
		return "A [b=  A Object]";
	}
	
	
}
