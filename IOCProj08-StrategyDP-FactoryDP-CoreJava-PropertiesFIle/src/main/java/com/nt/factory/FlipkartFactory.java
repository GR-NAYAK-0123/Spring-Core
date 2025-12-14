package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	
	static {
		try {
			//Locating the Properties file
			InputStream is = new FileInputStream("src/main/java/com/nt/commons/Info.properties");
			//creating the object for the properties
			props = new Properties();
			//Loading the properties file content to the Properties object
			props.load(is);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}  //static
	
	//static factory method having logic to create Flipkart object having the given dependent object
	public static Flipkart getInstances() {
		Courier courier = null;
		//Here we are getting the dependent class name from the properties object
		String courierClassName = props.getProperty("courier.name");
		try {
			//Loading the dependent class
			Class c = Class.forName(courierClassName);
			//courier = (Courier) c.newInstance();  //deprecated from Java9
			
			//Here we get all the constructors which present in that class
			Constructor<Courier> cons[] = c.getDeclaredConstructors();
			//But in our class there is one 0-parameterized constructor 
			courier = cons[0].newInstance();
		}
		catch(Exception e) {
			
		}
		//Create target class object
		Flipkart fpkt = new Flipkart();
		//Assigning dependent class object to target class object
		fpkt.setCourier(courier);
		
		return fpkt;
	}
}
