package com.xyy.test11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xyy.tools.TextFile;

public class Exercise1315 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			System.out.println("Usage: java JGrep file regex");
			System.exit(0);
		}
		Pattern p = Pattern.compile(args[1], Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		int index = 0;
		Matcher m = p.matcher("");
		for (String line : new TextFile(args[0])) {
			m.reset(line);
			while (m.find()) {
				System.out.println(index++ + ": " + m.group() + ": " + m.start());
			}
		}
	}

}
