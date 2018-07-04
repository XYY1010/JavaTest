package com.xyy.test12;

import static com.xyy.tools.Print.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

class ShowMethod1 {
	
	private static String usage = 
			"usage:\n" +
			"ShowMethods qualified.class.name\n" +
			"To show all methods in class or:\n" +
			"ShowMethods qualified class name 'word'\n" +
			"To search for methods involving 'word'";
	
	private static Pattern p = Pattern.compile("\\w+\\.");
	
	public static void main(String[] args) {
		if (args.length < 1) {
			print(usage);
			System.exit(0);
		}
		int lines = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if (args.length == 1) {
				for (Method method : methods) {
					print(p.matcher(method.toString()).replaceAll(""));
				}
				for (Constructor constructor : ctors) {
					print(p.matcher(constructor.toString()).replaceAll(""));
				}
				lines = methods.length + ctors.length;
			} else {
				for (Method method : methods) {
					if (method.toString().indexOf(args[1]) != -1) {
						print(p.matcher(method.toString()).replaceAll(""));
						lines++;
					}	
				}
				for (Constructor constructor : ctors) {
					if (constructor.toString().indexOf(args[1]) != -1) {
						print(p.matcher(constructor.toString()).replaceAll(""));
						lines++;
					}
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			print("No such class: " + e);
		}
	}
}

public class Exercise1418 {
	
}
