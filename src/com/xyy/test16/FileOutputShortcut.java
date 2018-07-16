package com.xyy.test16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {
	static String file = "FileOutputShortcut.out";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/FileOutputShortcut.java")));
		// Here's the shortcut:
		PrintWriter out = new PrintWriter(file);
		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null) {
			out.println(lineCount++ + ": " + s);
		}
		out.close();
		// Show the stored file:
		System.out.println(BufferedInputFile.read(file));
	}

}
