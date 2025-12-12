package com.nt.factory;

import com.nt.comps.DEngine;
import com.nt.comps.EEngine;
import com.nt.comps.Engine;
import com.nt.comps.PEngine;
import com.nt.comps.Vehicle;

public class VehicleFactory {
	//static factory method
	public static Vehicle getInstances(String engineType) {
		Engine engine = null;
		
		if(engineType.equalsIgnoreCase("dengine")) {
			engine = new DEngine();
			engine.setMileage(40);
		}
		else if(engineType.equalsIgnoreCase("pengine")) {
			engine = new PEngine();
			engine.setMileage(50);
		}
		else if(engineType.equalsIgnoreCase("eengine")) {
			engine = new EEngine();
			engine.setMileage(70);
		}
		else {
			throw new IllegalArgumentException("Invalid Engine type");
		}
		
		//Create target class object
		Vehicle vhl = new Vehicle();
		//Assigning dependent class object into target class object
		vhl.setEngine(engine);
		
		return vhl;
	}
}
