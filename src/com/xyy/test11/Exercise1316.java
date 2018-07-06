package com.xyy.test11;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.xyy.tools.Print.*;

public class Exercise1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			System.out.println("Usage: java JGrep file regex");
			//System.exit(0);
		}
		File[] files = new File("/Users").listFiles();
		Pattern p = Pattern.compile("\\w/\\w+?.\\w$");
		Matcher m = p.matcher("");
		int index = 0;
		for (File f : files) {
			m.reset(f.getAbsolutePath());
			while (m.find()) {
				print(index++ + ": " + m.group());
			}
		}
	}

}
