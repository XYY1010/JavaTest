package com.xyy.test6;

import static com.xyy.tools.Print.*;

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}
	public static String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	public static String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSuper sup = new StaticSub();
		print(sup.staticGet());
		print(sup.dynamicGet());
	}

}
