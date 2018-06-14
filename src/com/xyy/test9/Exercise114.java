package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class Generator {
	private int i = 0;
	private String[] movieName = {"Snow White", "Star Wars", "Avengers", "Iron Man", "Dead Pool", "Captain America", "Spider Man"};
	public String next() { 
		if(i < movieName.length) {
			return movieName[i++];
		}else {
			i = 0;
			return movieName[i++];
		}
	}
	public int arrayLen() {
		return movieName.length;
	}
}

public class Exercise114 {
	
	static Collection fill(Collection<String> collection) {
		Generator ge = new Generator();
		for (int i = 0; i < ge.arrayLen() * 2; i++) {
			collection.add(ge.next());
		}
		return collection;
	}
	
	static String[] fill(String[] strs) {
		Generator ge = new Generator();
		for (int i = 0; i < ge.arrayLen()*2; i++) {
			strs[i] = ge.next();
		}
		return strs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c1 = new ArrayList<String>();
		fill(c1);
		print(c1);
		Collection<String> c2 = new LinkedList<String>();
		fill(c2);
		print(c2);
		Collection<String> c3 = new HashSet<String>();
		fill(c3);
		print(c3);
		Collection<String> c4 = new LinkedHashSet<String>();
		fill(c4);
		print(c4);
		Collection<String> c5 = new TreeSet<String>();
		fill(c5);
		print(c5);
		String[] strs = new String[14];
		fill(strs);
		print(Arrays.toString(strs));
	}

}
