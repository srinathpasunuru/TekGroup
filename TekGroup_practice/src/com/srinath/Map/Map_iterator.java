package com.srinath.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_iterator {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//adding the key and value pairs to the set
		hm.put("a", 100);hm.put("b", 200);hm.put("c", 300);hm.put("d", 400);
		
		iterating_hashMap(hm);
		
	}

	private static void iterating_hashMap(HashMap<String, Integer> hm) {
		
		Iterator<Map.Entry<String, Integer>> iterator = hm.entrySet().iterator();
		
		while(iterator.hasNext()) {
			
			Map.Entry<String, Integer> map = iterator.next();
			System.out.println("key = " + map.getKey() + ", value = "+ map.getValue());
		}
		
	}

}
