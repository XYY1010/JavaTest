package com.xyy.test16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

class TextFile2 extends ArrayList<String> {
	// Read a file as a single string:
	public static String read(String filename) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
		try {
			String s;
			while ((s = in.readLine()) != null) {
				sb.append(s);
				sb.append("\n");
			}
		} finally {
			in.close();
		}
		return sb.toString();
	}
	// Write a single file in one method call:
	public static void write(String fileName, String text) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName).getAbsoluteFile())));
		try {
			out.print(text);
		} finally {
			// TODO: handle finally clause
			out.close();
		}
	}
	// Read a file, split by any regular expression:
	public TextFile2(String fileName, String splitter) throws IOException {
		super(Arrays.asList(read(fileName).split(splitter)));
		if (get(0).equals("")) {
			remove(0);
		}
	}
	// Normally read by lines:
	public TextFile2(String fileName) throws IOException {
		this(fileName, "\n");
	}
	public void write(String fileName) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName).getAbsoluteFile())));
		try {
			for (String item : this) {
				out.println(item);
			}
		} finally {
			// TODO: handle finally clause
			out.close();
		}
	}
}

public class Exercise1818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = TextFile2.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/Exercise1818.java");
		TextFile2.write("test.txt", file);
		TextFile2 text = new TextFile2("test.txt");
		text.write("test2.txt");
		// Break into unique sorted list of words:
		TreeSet<String> words = new TreeSet<String>(new TextFile2("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/Exercise1818.java", "\\W+"));
		// Display the capitalized words:
		System.out.println(words.headSet("a"));
	}

}
