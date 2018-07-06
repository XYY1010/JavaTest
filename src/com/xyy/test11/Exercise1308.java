package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.util.Arrays;

public class Exercise1308 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = Splitting.knights;
		print(s);
		print(Arrays.toString(s.split("the|you")));
	}

}
