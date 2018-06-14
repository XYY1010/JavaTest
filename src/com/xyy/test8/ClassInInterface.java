package com.xyy.test8;

import static com.xyy.tools.Print.*;

public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface {
		public void howdy() {
			print("Howdy!");
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}
