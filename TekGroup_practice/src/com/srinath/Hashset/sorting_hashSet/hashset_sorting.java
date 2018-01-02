package com.srinath.Hashset.sorting_hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class hashset_sorting {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("srinath");hs.add("akhil");hs.add("pasunuru");
		System.out.println(hs);
		sort_the_set(hs);
		
		}
		private static void sort_the_set(HashSet<String> hs) {
		List<String> ts = new ArrayList<String>();
		
		ts.addAll(hs);    //we create the array list and then sort it or can create a treeSet in which the elements will be in ascending order
		Collections.sort(ts);
		
		Iterator iterator = ts.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}

