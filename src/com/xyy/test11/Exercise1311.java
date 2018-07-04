package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1311 {

	private static String reg = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
	private static String str = "Arline ate eight apples and one orange while Anita hadn't any";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Input: \""+ str +"\"");
		print("Regular expression: \""+ reg +"\"");
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);
		while (m.find()) {
			print("Match \"" + m.group() + "\" at position " + m.start() + "-" + m.end());
		}
	}

}
