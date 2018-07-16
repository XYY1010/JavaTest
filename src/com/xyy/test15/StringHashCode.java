package com.xyy.test15;

import static com.xyy.tools.Print.*;
public class StringHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hellos = "Hello Hello".split(" ");
		print(hellos[0].hashCode());
		print(hellos[1].hashCode());
	}

}
