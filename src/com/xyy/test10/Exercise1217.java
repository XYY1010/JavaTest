package com.xyy.test10;

import static com.xyy.tools.Print.*;

class Amphibian {
	public void climb() { print("Amphibian climb"); }
	public static void move(Amphibian a) {
		a.climb();
	}
}

public class Exercise1217 extends Amphibian {
	
	public void climb() {
		print("Frog climb");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exercise1217 f = new Exercise1217();
			Amphibian.move(f);
			return;
		} finally {
			print("dispose()");
		}
	}

}
