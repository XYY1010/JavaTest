package com.xyy.test15;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.xyy.tools.Print.*;
import com.xyy.tools.TextFile;

public class Exercise1715 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = TextFile.read("/Users/xyy/Desktop/PDF/TIJ4-code-master/examples/net/mindview/util/Countries.java");
		Matcher m = Pattern.compile("\\b\\w+\\b").matcher(s);
		ArrayList<String> l = new ArrayList<String>();
		SlowMap<String, Integer> map = new SlowMap<String, Integer>();
		while (m.find()) {
			l.add(m.group(0));
		}
		for (String ss : l) {
			if (map.containsKey(ss)) {
				int val = map.get(ss);
				map.put(ss, val + 1);
			} else {
				map.put(ss, 1);
			}
		}
		print(map);
	}

}
