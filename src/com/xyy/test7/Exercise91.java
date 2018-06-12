package com.xyy.test7;

import static com.xyy.tools.Print.*;

abstract class Rodent {
	public abstract void liveHouse();
	public String toString() { return "Rodent"; }
}

class Mouse extends Rodent {
	public void liveHouse() { print(this + "live in room"); } 
	public String toString() { return "Mouse"; }
}

class Gerbil extends Rodent {
	public void liveHouse() { print(this + "live in soil pit"); }
	public String toString() { return "Gerbil"; }
}

class Hamster extends Rodent {
	public void liveHouse() { print(this + "live in cave");}
	public String toString() { return "Hamster"; }
}

public class Exercise91 {

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
