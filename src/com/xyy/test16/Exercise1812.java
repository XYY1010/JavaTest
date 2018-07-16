package com.xyy.test16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Exercise1812 {
	static String file = "Exercise1812.out";
	static LinkedList<String> list = new LinkedList<String>();
	public static void read(String filename) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		while ((s = in.readLine()) != null) {
			list.add(s);
		}
		in.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/Exercise1812.java");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		for (String s : list) {
			out.println(lineCount++ + ": " + s);
		}
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}

}
