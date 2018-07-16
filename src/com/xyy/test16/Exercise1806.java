package com.xyy.test16;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

import com.xyy.tools.ProcessFiles;


public class Exercise1806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINESE);
		if (args.length != 2) {
			System.err.println("Usage: java Exercise1806 path date");
			return;
		}
		long tmp = 0;
		try {
			df.setLenient(false);
			tmp = df.parse(args[1]).getTime();
		} catch (ParseException pe) {
			// TODO: handle exception
			pe.printStackTrace();
			return;
		}
		final long modTime= tmp;
		new ProcessFiles(new ProcessFiles.Strategy() {
			public void process(File file) {
				// TODO Auto-generated method stub
				if (modTime < file.lastModified()) {
					System.out.println(file);
				}
			}
		}, "java").start(new String[] {args[0]});
	}

}
