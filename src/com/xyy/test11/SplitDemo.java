package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =
				"This!!unusual use!!of exclaimation!!points";
		print(Arrays.toString(Pattern.compile("!!").split(input)));
		//Only do the first three:
		print(Arrays.toString(Pattern.compile("!!").split(input, 3)));	//限制将输入分割成字符串的数量
	}

}
