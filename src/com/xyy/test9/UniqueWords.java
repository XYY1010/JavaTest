package com.xyy.test9;

import java.util.Set;
import java.util.TreeSet;

import com.xyy.tools.TextFile;

public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>(new TextFile("SetOperations.java", "\\W+"));
		System.out.println(words);
	}

}
