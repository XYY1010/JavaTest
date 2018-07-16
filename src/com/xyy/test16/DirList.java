package com.xyy.test16;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

class DirFilter implements FilenameFilter {
	private Pattern pattern;
	public DirFilter(String regex) {
		// TODO Auto-generated constructor stub
		pattern = Pattern.compile(regex);
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return pattern.matcher(name).matches();
	}
	
}

public class DirList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("/Users/xyy/Desktop/PDF/TIJ4-code-master/examples/generics");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		}
		else {
			list = path.list(new DirFilter(args[0]));
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String string : list) {
			System.out.println(string);
		}
	}

}
