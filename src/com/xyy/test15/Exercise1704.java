package com.xyy.test15;

import com.xyy.tools.TextFile;
import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CollectionInitializator {
	private static String s;
	private static List<String> list = new ArrayList<String>();
	public static Collection<String> initialization() {
		s = TextFile.read("/Users/xyy/Desktop/PDF/TIJ4-code-master/examples/net/mindview/util/Countries.java");
		Matcher mInput = Pattern.compile("\\b\\w+\\b").matcher(s);
		while(mInput.find()) {
			list.add(mInput.group(0));
		}
		return list;
	}
}

public class Exercise1704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = CollectionInitializator.initialization();
		print(c);
	}

}
