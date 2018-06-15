package com.xyy.test9;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.xyy.tools.TextFile;

public class Exercise1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>(new TextFile("SetOperations.java", "\\W+"));
		System.out.println(words);
		Set<Character> vowels = new TreeSet<Character>();
		Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
		int totalNum = 0;
		for (String s : words) {
			char[] cs = s.toCharArray();
			int cnt = 0;
			for(char c : cs) {
				if (vowels.contains(c)) {
					totalNum++;
					cnt++;
				}
			}
			System.out.println(s + ": " + cnt);
		}
		System.out.println("total: " + totalNum);
		
	}

}
