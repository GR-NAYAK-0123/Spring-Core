package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	@Autowired
	private A a;  // Here we are achieving the cyclic DI with field injection
	
	/*@Autowired
	public B(A a) {             //Here by using constructor injection the cyclic DI is not possible
		this.a = a;
		System.out.println("B:1- Param constructor");
	}*/

	@Override
	public String toString() {
		return "B [a= B Object]";
	}
	
	
}
