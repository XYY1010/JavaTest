package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1310 {

	private static String s = "Java now has regular expressions";
	private static String[] ss = {"^Java", "\\Breg.*", 
								  "n.w\\s+h(a|i)s", "s?",
								  "s*", "s+", "s{4}",
								  "s{1}", "s{0,3}"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String str : ss) {
			print("Regular expression: \"" + str + "\"");
			Pattern p = Pattern.compile(str);
			Matcher m = p.matcher(s);
			while (m.find()) {
				print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
			}
		}
	}

}
