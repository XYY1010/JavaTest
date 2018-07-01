package com.xyy.test11;

import static com.xyy.tools.Print.*;

public class Replacing {
	
	static String s = Splitting.knights;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(s.replaceFirst("f\\w+", "located"));
		print(s.replaceAll("shrubbery|tree|herring", "banana"));
	}

}
