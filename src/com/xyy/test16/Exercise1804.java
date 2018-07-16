package com.xyy.test16;

import java.io.File;
import java.io.IOException;

import com.xyy.tools.Directory;
import static com.xyy.tools.Print.*;

public class Exercise1804 {
	public static long res = 0;
	public static long calByteDirectoryTree(File root, String regex) throws IOException {
		for (File file : Directory.walk(root.getAbsolutePath(), regex)) {
			res += file.length();
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalByte = 0;
		File file = new File(".");
		try {
			if (file.isDirectory()) {
				totalByte = calByteDirectoryTree(file, "T.*\\.java");
			} else {
				totalByte += file.length();
			}
		} catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		
		print("Total size of files: " + totalByte);
	}

}
