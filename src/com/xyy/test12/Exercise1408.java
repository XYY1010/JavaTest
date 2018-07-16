package com.xyy.test12;

import static com.xyy.tools.Print.*;

public class Exercise1408 {

	public static void extendsTree(Class<?> type) {
		if (type == null) {
			return;
		} else {
			print(type.getName());
		}
		for (Class<?> i : type.getInterfaces()) {
			print("Interface: " + i.getSimpleName());
			extendsTree(i.getSuperclass());
		}
		extendsTree(type.getSuperclass());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extendsTree(FancyToy.class);
	}

}
