package com.xyy.test12;

import static com.xyy.tools.Print.*;

import java.io.IOException;
import java.lang.reflect.Field;

public class Exercise1409 {
	
	public static void extendsTree(Class<?> type) {
		if(type == null) {
			return;
		} else {
			print(type.getName());
			if (type.getDeclaredFields().length != 0) {
				print("Fields: ");
			}
			for (Field f : type.getDeclaredFields()) {
				print(f);
			}
			for (Class<?> i : type.getInterfaces()) {
				print("Interface: " + i.getSimpleName());
				extendsTree(i.getSuperclass());
			}
			extendsTree(type.getSuperclass());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extendsTree(IOException.class);
	}

}
