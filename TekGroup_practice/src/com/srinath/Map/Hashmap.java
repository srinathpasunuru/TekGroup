package com.srinath.Map;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//adding the key and value pairs to the set
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		
		System.out.println(hm);
		
		Set<Map.Entry<String, Integer>> set = hm.entrySet(); /* entrySet() will return set view which
		 contains keys and values which are combined in the Map.Entry class*/
		
		for(Map.Entry<String, Integer> c: set) {
			System.out.println(c.getKey()+ ":" +c.getValue());
		}
		
	}

}
