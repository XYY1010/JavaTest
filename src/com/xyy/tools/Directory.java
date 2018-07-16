package com.xyy.tools;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory {
	public static File[] local(File dir, final String regex) {
		return dir.listFiles(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(name).matches();
			}
		});
	}
	public static File[] local(String path, final String regex) {	// Overloaded
		return local(new File(path), regex);
	}
	// A two-tuple for returning a pair of objects:
	public static class TreeInfo implements Iterable<File> {
		public List<File> files = new ArrayList<File>();
		public List<File> dirs = new ArrayList<File>();
		// The default iterable elements is the file list:
		public Iterator<File> iterator() {
			return files.iterator();
		}
		void addAll(TreeInfo other) {
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}
		public String toString() {
			return "dirs: " + PPrint.pformat(dirs) + "\n\nfiles: " + PPrint.pformat(files);
		}
	}
	public static TreeInfo walk(String start, String regex) {	// Begin recursion
		return recurseDirs(new File(start), regex);
	}
	public static TreeInfo walk(File start, String regex) {		// Overloaded
		return recurseDirs(start, regex);
	}
	public static TreeInfo walk(File start) { 	// Everything
		return recurseDirs(start, ".*");
	}
	public static TreeInfo walk(String start) {
		return recurseDirs(new File(start), ".*");
	}
	
	static TreeInfo recurseDirs(File startDir, String regex) {
		TreeInfo result = new TreeInfo();
		for (File file : startDir.listFiles()) {
			if (file.isDirectory()) {
				result.dirs.add(file);
				result.addAll(recurseDirs(file, regex));
			} else {	// Regular file
				if (file.getName().matches(regex)) {
					result.files.add(file);
				}
			}
		}
		return result;
	}
	// Simple validation test:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println(walk("/Users/xyy/eclipse-workspace/JavaTest/src/com/xyy/"));
		} else {
			for (String string : args) {
				System.out.println(walk(string));
			}
		}
	}

}
