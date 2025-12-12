package com.nt.comps;

public class Vehicle {
	//HAS-A Property
	private Engine engine;
	
	//Non-Parameterized constructor
	public Vehicle() {
		System.out.println("Vehicle: 0 - Param Constructor");
	}

	//Setter method (It inject the dependent class object to target class object)
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//b.method
	public String travelling(int totalKillometer, int petrolPrice) {
		//Calculating the total amount of money required
		double amount = 0.0;
		// TotalamountOfMoney = TotalLiterOfOil * PetrolPrice
		//TotalLiterOfOil = (TotalKillometer / Mileage)
		amount = (totalKillometer/engine.getMileage()) * petrolPrice;
		return "For our "+totalKillometer+" kilometer of ridding we need to spend around : Rs - "+amount+" (Liter of petrol - "+totalKillometer/engine.getMileage()+")";
	}
}
