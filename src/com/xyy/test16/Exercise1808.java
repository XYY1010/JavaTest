package com.xyy.test16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Exercise1808 {
	static LinkedList<String> list = new LinkedList<String>();
	public static void read(String filename) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		while ((s = in.readLine()) != null) {
			list.addFirst(s);
		}
		in.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/BufferedInputFile.java");
		} else {
			read(args[0]);
		}
		for (String string : list) {
			System.out.println(string);
		}
	}

}
