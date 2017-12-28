package com.srinath.Hashset;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("srinath");
		set.add("ramakanth");
		set.add("Reddy");
		set.add("srinath");  //srinath is already added to the set so the duplicate element cant be stored.
		
		System.out.println("elements in the HashSet are: "+ set);
		System.out.println("does set contains 'ramakanth'? " + set.contains("ramakanth"));
		
		set.remove("Reddy");
		System.out.println("elements in the HashSet are: "+ set);
		
		set.clear();
		System.out.println("after clearing the set :" + set);
	}

}
