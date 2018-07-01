package com.xyy.test11;

import java.util.Arrays;
import static com.xyy.tools.Print.*;

public class Exercise1307 {

	static String s = 
			"Instances of this class are immutable and are safe for" +
	        " use by multiple concurrent threads. Instances of the Matcher" +
			" class are not safe for such use.";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reg = "^[A-Z].*[\\.]$";
		if (s.matches(reg)) {
			print("yes");
		} else {
			print("no");
		}
	}

}
