package com.wayne.collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App13 {

	public static String[] vehicles = {
		"ambulance", "helicopter", "lifeboat"
	};
	
	public static String[][] drivers = {
		{"Fred", "Sue", "Pete"},
		{"Sue", "Richard", "Bob", "Fred"},
		{"Pete", "Mary", "Bob"}
	};
	
	public static void main(String[] args) {
		
		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();
		
		for(int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] drivesList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<String>();
			
			for(String drive : drivesList) {
				driverSet.add(drive);
			}
			
			personnel.put(vehicle, driverSet);
		}
		
		Set<String> driversList = personnel.get("helicopter");
		
		for(String driver : driversList) {
			System.out.println(driver);
		}
	}
}
