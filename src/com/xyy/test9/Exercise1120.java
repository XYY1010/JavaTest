package com.xyy.test9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static com.xyy.tools.Print.*;
import com.xyy.tools.TextFile;

public class Exercise1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>(new TextFile("SetOperations.java", "\\W+")); 
		print(words);
		int totalNum = 0;
		int ANum = 0, ENum = 0, INum = 0, ONum = 0, UNum = 0, 
			aNum = 0, eNum = 0, iNum = 0, oNum = 0, uNum = 0;
		Set<Character> vowels = new HashSet<Character>();
		Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
		for (String s : words) {
			char[] cs = s.toCharArray();
			for(char c : cs) {
				if (vowels.contains(c)) {
					switch (c) {
					case 'A':
						ANum++;
						break;
					case 'E':
						ENum++;
						break;
					case 'I':
						INum++;
						break;
					case 'O':
						ONum++;
						break;
					case 'U':
						UNum++;
						break;
					case 'a':
						aNum++;
						break;
					case 'e':
						eNum++;
						break;
					case 'i':
						iNum++;
						break;
					case 'o':
						oNum++;
						break;
					case 'u':
						uNum++;
						break;
					default:
						break;
					}
					totalNum++;
				}
			}
		}
		print("A appears " + ANum + " times");
		print("E appears " + ENum + " times");
		print("I appears " + INum + " times");
		print("O appears " + ONum + " times");
		print("U appears " + UNum + " times");
		print("a appears " + aNum + " times");
		print("e appears " + eNum + " times");
		print("i appears " + iNum + " times");
		print("o appears " + oNum + " times");
		print("u appears " + uNum + " times");
		print("All vowels appear " + totalNum + " times");
		
	}

}
