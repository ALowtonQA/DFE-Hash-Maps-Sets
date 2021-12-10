package com.qa.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		// Classic List
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("Hello");
		listOfStrings.add("There");
		listOfStrings.add("People");
		
		// Create HashMap
		HashMap<String, Integer> nameAndAge = new HashMap<>();
		
		// Add key/value pairs
		nameAndAge.put("Anoush", 28);
		nameAndAge.put("Pawel", 26);
		nameAndAge.put("Jordan", 52);
		
//		// This will overwrite the value for "Anoush"
		nameAndAge.put("Anoush", 30);
		
		System.out.println(nameAndAge);
		
//		// GET
		System.out.println(nameAndAge.get("Anoush"));
		
//		// SIZE
		System.out.println(nameAndAge.size());
		
//		// REMOVE
		nameAndAge.remove("Anoush");
		System.out.println(nameAndAge);
		
		// CLEAR
		nameAndAge.clear();
		
		// FOR LOOPS
		for (String key : nameAndAge.keySet()) {
			System.out.println(key);
		}
		
		for (Integer value : nameAndAge.values()) {
			System.out.println(value);
		}
		
		for (Entry<String, Integer> keyValue : nameAndAge.entrySet()) {
			System.out.println(keyValue);
		}
	}	
}
