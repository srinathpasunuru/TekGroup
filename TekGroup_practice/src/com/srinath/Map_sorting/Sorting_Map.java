package com.srinath.Map_sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sorting_Map {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("ten", 10);hm.put("five", 5);hm.put("eight", 8);
		hm.put("one", 1);hm.put("six", 6);hm.put("three", 3);
		
		sort_the_map(hm);
	}

	private static void sort_the_map(HashMap<String, Integer> hm) {
		
		List<Map.Entry<String, Integer>> entry = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(entry, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue()); //if we replace o1 and o2 we get the map in descending order 
			}
			
		});
		
		Iterator itr = entry.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> map = (Entry<String, Integer>) itr.next();
			System.out.println("key = " + map.getKey() + ", value = "+ map.getValue());
		}
	}

}
