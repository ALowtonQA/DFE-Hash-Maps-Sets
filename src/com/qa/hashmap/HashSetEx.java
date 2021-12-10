package com.qa.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		// CREATE
		HashSet<String> mySet = new HashSet<>();
		
		// ADD
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("D");
		mySet.add("D");
		mySet.add("D");
		mySet.add("D");
		mySet.add("D");
		mySet.add("D");
		mySet.add("D");
		mySet.add("D");
		mySet.add("D");
		mySet.add("D");
		mySet.add("E");
	
		// SIZE
		System.out.println(mySet.size());

		// CLEAR
		mySet.clear();
		
		// Is the hashset empty?
		System.out.println(mySet.isEmpty());
		
		// CONTAINS
		System.out.println(mySet.contains("D"));
		
		// LOOPING
		for (String i : mySet) {
			System.out.println(i);
		}
	}
}
