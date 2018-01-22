package com.srinath.ContactApp.utility;

public class StringUtil {

	public static String toCommaSeperatedArray(Object[] items) {
		
		StringBuilder sb = new StringBuilder();
		for(Object item: items) {
			sb.append(item).append(",");
		}
		if(sb.length()>0) {
			sb.deleteCharAt(sb.length()-1);
		}
		return sb.toString();
	}
}
