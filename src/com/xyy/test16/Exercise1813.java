package com.xyy.test16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringReader;

public class Exercise1813 {

	static String file = "Exercise1813.out";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/Exercise1813.java")));
		LineNumberReader in = new LineNumberReader(new StringReader(BufferedInputFile.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/Exercise1813.java")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		String s;
		while ((s = in.readLine()) != null) {
			out.println(in.getLineNumber() + ": " + s);
		}
		out.close();
		System.out.print(BufferedInputFile.read(file));
	}

}
