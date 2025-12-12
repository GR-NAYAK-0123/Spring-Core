package com.nt.comps;

public final class EEngine implements Engine {
	private int mileage;

	public EEngine() {
		System.out.println("EEngine : 0 - Param Constructor");
	}
	

	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		System.out.println("EEngine.setMileage()");
		this.mileage = mileage;
	}
}
