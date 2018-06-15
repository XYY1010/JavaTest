package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xyy.tools.TextFile;

public class Exercise1126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, ArrayList<Integer>> mp = new HashMap<String, ArrayList<Integer>>();
		List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
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
		
		int cnt = 0;
		String[] str = new String[10000];
		for(String s : mp.keySet()) {
			for(Integer i : mp.get(s)) {
				str[i] = s;
				cnt++;
			} 
		}
		for (int i = 0; i < cnt; i++) {
			printnb(str[i] + " ");
		}
		print();
	}

}
