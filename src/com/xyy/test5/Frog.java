package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Amphibian{
	public void climb() { print("Amphibian climb"); }
	public static void move(Amphibian a){
		a.climb();
	}
}

public class Frog extends Amphibian {

	public void climb(){
		print("Frog climb");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog f = new Frog();
		Amphibian.move(f);
	}

}
