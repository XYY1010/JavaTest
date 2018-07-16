package com.xyy.test16;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.xyy.tools.TextFile;

public class Exercise1801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new FilenameFilter() {
				private String ext = args[0].toLowerCase();
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					// Only analyze source files with the specified
					// extension (given as the first command line argument)
					if (name.toLowerCase().endsWith(ext)) {
						// Only filter upon file extension?
						if (args.length == 1) {
							return true;
						}
						Set<String> words = new HashSet<String>(
								new TextFile(new File(dir, name).getAbsolutePath(), "\\W+"));
						for (int i = 1; i < args.length; i++) {
							if (words.contains(args[i])) {
								return true;
							}
						}
					}
					return false;
				}
			});
			Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
			for (String dirItem : list) {
				System.out.println(dirItem);
			}
		}
	}
}
