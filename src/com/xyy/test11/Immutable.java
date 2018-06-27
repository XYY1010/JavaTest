package com.xyy.test11;

import static com.xyy.tools.Print.*;

public class Immutable {

	public static String upcase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "howdy";
		print(q);
		String qq = upcase(q);
		print(qq);
		print(q);
	}

}
