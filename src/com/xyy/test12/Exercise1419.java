package com.xyy.test12;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static com.xyy.tools.Print.*;

public class Exercise1419 {

	private static String usage = 
			"usage:\n" + 
			"ToyTest qualified.class.name\n" +
			"ShowMethods qualified class name 'word'\n" +
			"To search for methods involving 'word'";
	private static Pattern p = Pattern.compile("\\w+\\.");
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		int lines = 0;
		int i = 0;
		try {
			Class<?> c = Class.forName("com.xyy.test12.Toy");
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			for (Method method : methods) {
				print(p.matcher(method.toString()).replaceAll(""));
			}
			for (Constructor constructor : ctors) {
				print(p.matcher(constructor.toString()).replaceAll(""));
				constructor.newInstance(i++);
			}
			lines = methods.length + ctors.length;
			print(lines);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			print("Class Not Found " + e);
		}
				
	}

}
