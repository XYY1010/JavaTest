package com.xyy.test16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.xyy.tools.TextFile;

public class Exercise1817 {
	static Map<Character, Integer> mp = new HashMap<Character, Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = TextFile.read("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/Exercise1817.java");
		TextFile.write("test.txt", file);
		ArrayList<String> words = new ArrayList<String>(new TextFile("test.txt", "\\W+"));
		for (String string : words) {
			char[] cs = string.toCharArray();
			for (char c : cs) {
				if (mp.containsKey(c)) {
					int v = mp.get(c);
					mp.put(c, v + 1);
				} else {
					mp.put(c, 1);
				}
			}
		}
		for (Character key : mp.keySet()) {
			System.out.println(key + " => " + mp.get(key));
		}
	}

}
