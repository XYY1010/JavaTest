package com.xyy.test12;

import static com.xyy.tools.Print.*;

import java.util.Arrays;

public class Exercise1410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Returns an array of Class objects reflecting all the classes and"
				+ " interfaces declared as members of the class represented by this "
				+ "Class object. This includes public, protected, default (package) "
				+ "access, and private classes and interfaces declared by the class,"
				+ " but excludes inherited classes and interfaces. This method returns"
				+ " an array of length 0 if the class declares no classes or interfaces"
				+ " as members, or if this Class object represents a primitive type, an "
				+ "array class, or void.";
		char[] chArr = s.toCharArray();
		print(chArr.getClass());
		print(chArr.getClass().getSuperclass());
	}

}
