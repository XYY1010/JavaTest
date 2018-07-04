package com.xyy.test12;

import static com.xyy.tools.Print.*;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Colorful {}

class Toy {
	Toy() {}		//将Toy的默认构造器注释掉后，就无法用Object引用利用newInstance()来创建类，这个过程要求必须带有默认构造器。
	Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Colorful {
	public FancyToy() {
		// TODO Auto-generated constructor stub
		super(1);
	}
}

public class ToyTest {

	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name: " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = null;
		try {
			c = Class.forName("com.xyy.test12.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class face : c.getInterfaces()) {
			printInfo(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			// TODO: handle exception
			print("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			print("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}

}
