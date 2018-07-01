package com.xyy.test11;

import static com.xyy.tools.Print.*;

public class WhitherStringBuilder {

	public static String implicit(String[] fields) {
		String result = "";
		for (int i = 0; i < fields.length; i++) {
			result += fields[i];
		}
		return result;
	}
	
	public static String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			result.append(fields[i]);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(implicit(new String[] {"abc", "de", "fgh"}));
		print(explicit(new String[] {"i", "jkl", "mnopq", "rst", "uvwxyz"}));
	}

}
