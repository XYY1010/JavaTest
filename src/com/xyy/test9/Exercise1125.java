package com.xyy.test9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xyy.tools.Print.*;
import com.xyy.tools.TextFile;

public class Exercise1125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, ArrayList<Integer>> mp = new HashMap<String, ArrayList<Integer>>();
		List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		System.out.println(words);
		int pos = 0;
		for (String s : words) {
			if (mp.containsKey(s)) {
				mp.get(s).add(pos);
			} else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(pos);
				mp.put(s, list);
			}
			
			pos++;
		}
		
		print(mp);
	}

}
