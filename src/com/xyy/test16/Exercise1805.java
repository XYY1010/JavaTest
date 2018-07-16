package com.xyy.test16;

import java.io.File;
import java.io.IOException;

import com.xyy.tools.Directory;

public class Exercise1805 {
	public interface Strategy {
		void process(File file);
	}
	private Strategy strategy;
	private String regex;
	public Exercise1805(Strategy strategy, String regex) {
		this.strategy = strategy;
		this.regex = regex;
	}
	public void start(String[] args) {
		try {
			if (args.length == 0) {
				processDirectoryTree(new File("."), regex);
			} else {
				for (String arg : args) {
					File fileArg = new File(arg);
					if (fileArg.isDirectory()) {
						processDirectoryTree(fileArg, regex);
					} else {
						strategy.process(new File(arg).getCanonicalFile());
					}
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	public void processDirectoryTree(File root, String regex) throws IOException {
		for (File file : Directory.walk(root.getAbsolutePath(), regex)) {
			strategy.process(file.getCanonicalFile());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise1805(new Strategy() {
			
			@Override
			public void process(File file) {
				// TODO Auto-generated method stub
				System.out.println(file);
			}
		}, "T.*\\.java").start(args);
	}

}
