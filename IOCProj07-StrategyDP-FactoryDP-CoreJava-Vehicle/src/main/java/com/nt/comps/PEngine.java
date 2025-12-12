package com.nt.comps;

public final class PEngine implements Engine {
	private int mileage;

	public PEngine() {
		System.out.println("PEngine : 0 - Param Constructor");
	}
	
	

	public int getMileage() {
		return mileage;
	}



	public void setMileage(int mileage) {
		System.out.println("PEngine.setMileage()");
		this.mileage = mileage;
	}


}
