package com.xyy.test16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class Exercise1814 {
	static String file = "Exercise1814.out";
	
	public static LinkedList<String> read(String filename) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		LinkedList<String> list = new LinkedList<String>();
		while ((s = in.readLine()) != null) {
			list.add(s);
		}
		in.close();
		return list;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> list = read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/Exercise1814.java");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		long t1 = System.currentTimeMillis();
		for (String s : list) {
			for(int i = 0; i<10000; i++) {
				out.println(lineCount + ": " + s);
			}
			lineCount++;
		}
		long t2 = System.currentTimeMillis();
		System.out.println("buffered: " + (t2 - t1));
		out.close();
		out = new PrintWriter(new FileWriter(file));
		lineCount = 1;
		t1 = System.currentTimeMillis();
		for (String s : list) {
			for (int i = 0; i < 10000; i++) {
				out.println(lineCount + ": " + s);
			}
			lineCount++;
		}
		t2 = System.currentTimeMillis();
		System.out.print("unbuffered: " + (t2 - t1));
		out.close();
	}

}
