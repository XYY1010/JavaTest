package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {

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
		Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
		while (m.find()) {
			for (int i = 0; i <= m.groupCount(); i++) {
				printnb("[" + m.group(i) + "]");
			}
			print();
		}
	}

}
