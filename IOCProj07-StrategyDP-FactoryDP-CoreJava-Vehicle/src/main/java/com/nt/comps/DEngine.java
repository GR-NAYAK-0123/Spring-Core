package com.nt.comps;

public final class DEngine implements Engine {
	//HAS-A Property
	private int mileage;
	
	public DEngine() {
		System.out.println("DEngine : 0 - Param Constructor");
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		System.out.println("DEngine.setMileage()");
		this.mileage = mileage;
	}



}
