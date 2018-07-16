package com.xyy.test16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise1809 {
	static ArrayList<String> list = new ArrayList<String>();
	public static void read(String filename) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		while((s = in.readLine()) != null) {
			list.add(s);
		}
		in.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/BufferedInputFile.java");
		for (String string : list) {
			System.out.println(string.toUpperCase());
		}
	}

}
