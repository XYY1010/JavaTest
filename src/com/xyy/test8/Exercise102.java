package com.xyy.test8;

import static com.xyy.tools.Print.*;


class MyClass {
	private String str;
	public MyClass(String s) {
		str = s;
	}
	public String toString() { 
		return str; 
	}
}

public class Exercise102 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence s = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			s.add(new MyClass(i + " "));
		}
		Selector selector = s.selector();
		while (!selector.end()) {
			printnb(selector.current());
			selector.next();
		}
	}

}
