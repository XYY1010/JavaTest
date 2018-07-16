package com.xyy.test16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {

	static String file = "BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null) {
			out.println(lineCount++ + ": " + s);
		}
		out.close();
		// Show the stored file:
		System.out.print(BufferedInputFile.read(file));
	}

}
