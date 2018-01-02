package com.srinath.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Iterator {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("srinath");set.add("ramakanth");set.add("Reddy");

		iterating_hashset(set);
	}

	private static void iterating_hashset(HashSet<String> set) {
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next() + " ");
		}
		
	}

}
