package com.xyy.test7;

import static com.xyy.tools.Print.print;


interface Rodent2 {
	void liveHouse();
}

class Mouse2 implements Rodent2 {
	public void liveHouse() { print("Mouse live in room"); }
	public String toString() { return "Mouse"; }
}

class Gerbil2 implements Rodent2 {
	public void liveHouse() { print("Gerbil live in soil pit"); }
	public String toString() { return "Gerbil"; }
}

class Hamster2 implements Rodent2 {
	public void liveHouse() { print("Hamster live in cave"); }
	public String toString() { return "Hamster"; }
}

public class Exercise97 {

	public static void live(Rodent2 r) {
		r.liveHouse();
		print(r);
	}
	
	public static void showAll(Rodent2[] rs) {
		for(Rodent2 r : rs) {
			live(r);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent2[] rodent2s = {
				new Mouse2(),
				new Gerbil2(),
				new Hamster2()
		};
		showAll(rodent2s);
	}

}
