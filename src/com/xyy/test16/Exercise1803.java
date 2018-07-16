package com.xyy.test16;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

import static com.xyy.tools.Print.*;

public class Exercise1803 {
	// The File.length() method reads the number of bytes in the file.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new FilenameFilter() {
				private Pattern pattern = Pattern.compile(args[0]);
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return pattern.matcher(name).matches();
				}
			});
			Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
			long total = 0;
			long fs;
			for (String dirItem : list) {
				fs = new File(path, dirItem).length();
				print(dirItem + ", " + fs + " byte(s)");
				total += fs;
			}
			print("=======================");
			print(list.length + " file(s), " + total + "bytes");
		}
	}

}
