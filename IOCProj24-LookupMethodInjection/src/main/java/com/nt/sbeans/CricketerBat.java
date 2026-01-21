package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketerBat {

	public CricketerBat() {
		System.out.println("CricketerBat: 0-Param constructor");
	}
	
	public int score() {
		System.out.println("CricketerBat.score()");
		return new Random().nextInt(200);
	}
}
