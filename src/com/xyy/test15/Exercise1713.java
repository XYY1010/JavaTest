package com.xyy.test15;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xyy.tools.TextFile;

public class Exercise1713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = TextFile.read("/Users/xyy/Desktop/PDF/TIJ4-code-master/examples/net/mindview/util/Countries.java");
		Matcher m = Pattern.compile("\\b\\w+\\b").matcher(s);
		List<String> l = new ArrayList<String>();
		while(m.find()) {
			l.add(m.group(0));
		}
		AssociativeArray<String, Integer> map = new AssociativeArray<String, Integer>(l.size());
		for (String ss : l) {
			if (map.get(ss) == null) {
				map.put(ss, 1);
			} else {
				int index = map.get(ss);
				map.put(ss, index + 1);
			}
		}
		print(map);
	}

}
