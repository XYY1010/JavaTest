package com.xyy.test11;

public class Rudolph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String pattern : new String[] {"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"}) {
			System.out.println("Rudolph".matches(pattern));
		}
	}

}
