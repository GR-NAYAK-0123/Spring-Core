package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bazar")
public class StyleBazar {
	
	public StyleBazar() {
		System.out.println("StyleBazar: 0-Param constructor");
	}
	
	public Double amount() {
		return 1000.0;
	}
}
