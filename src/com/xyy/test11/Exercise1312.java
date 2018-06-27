package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1312 {

	static public final String POEM = 
			"Twas brilling, and the slithy toves\n" +
		    "Did gyre and gimble in the wabe.\n" + 
		    "All mimsy were the borogoves,\n" +
		    "And the mome raths outgrabe.\n\n" +
		    "Beware the Jabberwock, my son,\n" +
		    "The jaws that bite, the claws that catch.\n" +
		    "Beware the Jubjub bird, and shun\n" +
		    "The frumious Bandersnatch.";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> mp = new HashMap<String, Integer>(); 
		Matcher m = Pattern.compile("\\b[a-z]\\w+").matcher(POEM);
		while (m.find()) {
			for (int i = 0; i <= m.groupCount(); i++) {
				if (mp.containsKey(m.group(i))) {
					int val = mp.get(m.group(i));
					mp.put(m.group(i), val+1);
				} else {
					mp.put(m.group(i), 1);
				}
			}
		}
		print(mp);
	}

}
