package com.srinath.list.Sorting_arraylist;

import java.util.Comparator;

public class Comparing_by_age implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		//this will return the array list in the ascending order by comparing age
		//if we want in the descending order swap 1 and -1.
		//for comparing string we use compareTo() method which compares two strings
		
		if(s1.age == s2.age) {
			return 0;
		}
		else if(s1.age > s2.age){
			return 1;
		}
		else
			return -1;
	}

}
