package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Rodent {
	public void liveHouse() {}
	public String toString() { return "Rodent"; }
}

class Mouse extends Rodent {
	public void liveHouse() { print("Mouse live in room"); }
	public String toString() { return "Mouse"; }
}

class Gerbil extends Rodent {
	public void liveHouse() { print("Gerbil live in soil pit"); }
	public String toString() { return "Gerbil"; }
}

class Hamster extends Rodent {
	public void liveHouse() { print("Hamster live in cave"); }
	public String toString() { return "Hamster"; }
}

public class Exercise89 {

	public static void live(Rodent r) {
		r.liveHouse();
		print(r);
	}
	
	public static void showAll(Rodent[] rs) {
		for (int i = 0; i < rs.length; i++) {
			live(rs[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] rodents = new Rodent[] {
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		showAll(rodents);
	}

}
