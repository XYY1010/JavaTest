package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.util.Arrays;


public class Exercise1314 {
	
	public static void main(String[] args) {
		String input = "This!!unusual use!!of exclaimation!!points";
		print(Arrays.toString(input.split("!!")));
		print(Arrays.toString(input.split("!!", 3)));
	}
}
