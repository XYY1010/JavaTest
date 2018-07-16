package com.xyy.test16;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.xyy.tools.BinaryFile;

public class Exercise1819 {
	static Map<Byte, Integer> mp = new HashMap<Byte, Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] b = BinaryFile.read(new File("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/Exercise1819.java"));
		for (int i = 0; i < b.length; i++) {
			if (mp.containsKey(b[i])) {
				int v = mp.get(b[i]);
				mp.put(b[i], v + 1);
			} else {
				mp.put(b[i], 1);
			}
		}
		for (byte c : mp.keySet()) {
			System.out.println(c + " ==> " + mp.get(c));
		}
	}

}
