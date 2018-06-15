package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xyy.tools.TextFile;

class MapWords {
	private int val;
	private String word;
	public MapWords(String word, int val) {
		this.setWord(word);
		this.setVal(val);
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
}

public class Exercise1122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		print(words);
		Set<MapWords> st = new HashSet<MapWords>();
		MapWords[] mwArr = new MapWords[10000];
		int count = 0;
		for(String s : words) {
			boolean inMw = false;
			int i;
			for (i = 0; i < mwArr.length; i++) {
				if(mwArr[i] != null && mwArr[i].getWord().equals(s)) {
					inMw = true;
					break;
				}
			}
			if (inMw) {
				int cnt = mwArr[i].getVal();
				mwArr[i].setVal(cnt + 1);
			} else {
				MapWords mw = new MapWords(s, 1);
				mwArr[count++] = mw;
			}
		}
		Collections.addAll(st, mwArr);
		for (int i = 0; i < count; i++) {
			print(mwArr[i].getWord() + " = " + mwArr[i].getVal());
		}
	}

}
