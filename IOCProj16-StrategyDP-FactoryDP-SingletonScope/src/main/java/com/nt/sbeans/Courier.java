package com.nt.sbeans;

public interface Courier {
	
	public String deliver(int oid);
	public default void msg() {          // This is default method in an interface
		
	}
}
