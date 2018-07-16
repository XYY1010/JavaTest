package com.xyy.test16;

import static com.xyy.tools.Print.*;

import java.io.File;

import com.xyy.tools.Directory;
import com.xyy.tools.PPrint;

public class DirectoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// All directories:
		PPrint.pprint(Directory.walk(".").dirs);
		print("*****************************");
		// All files beginning with 'T'
		for (File file : Directory.local(".", "T.*")) {
			print(file);
		}
		print("-----------------------------");
		// All java files beginning with 'T':
		for (File file : Directory.walk(".", "T.*\\.java")) {
			print(file);
		}
		print("=============================");
		// Class files containing "Z" or "z":
		for (File file : Directory.walk(".", ".*[Zz].*\\.class")) {
			print(file);
		}
	}

}
