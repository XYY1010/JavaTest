package com.xyy.test11;

import static com.xyy.tools.Print.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xyy.tools.TextFile;

public class Exercise1319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			print("Usage: java JGrep file regex");
			// System.exit(0);
		}
		Pattern p = Pattern.compile("\\b[A-Z]\\w+");
		int index = 0;
		Matcher m = p.matcher("");
		for (String line : new TextFile("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test6/Exercise817.java")) {
			m.reset(line);
			while (m.find()) {
				System.out.println(index++ + ": " + m.group() + ": " + m.start());
			}
		}
	}

}
