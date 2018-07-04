package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Splitting {

	public static String knights = 
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree in the forest... " + 
			"with... a herring!";
	
	public static void split(String regex) {
		print(Arrays.toString(knights.split(regex)));
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		split(" ");
		split("\\W+");	// '\\W'表示非单词字符（如果W小写，\w，则表示一个单词字符）
		split("n\\W+");
	}

}
