package com.xyy.test16;

import static com.xyy.tools.Print.*;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

class SortedDirList {
	private File path;
	public SortedDirList() { path = new File("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/test16/"); }
	public SortedDirList(File path) { this.path = path; }
	public String[] list() {
		String[] list = path.list();
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		return list;
	}
	public String[] list(final String fn_regex) {
		String[] list = path.list(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(fn_regex);
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(name).matches();
			}
		});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		return list;
	}
}

public class Exercise1802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Default constructor == current directory
		SortedDirList dir = new SortedDirList();
		print(Arrays.asList(dir.list("Exercise180[12].*\\.java")));
	}

}
