package com.xyy.test9;

import java.util.Set;
import java.util.TreeSet;

import com.xyy.tools.TextFile;

public class UniqueWordsAlphabetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("SetOperations.java", "\\W+"));
		System.out.println(words);
	}

}
