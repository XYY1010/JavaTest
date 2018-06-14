package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Iterator;

class Rodent {
	public void liveHouse() {}
	public String toString() { return "Rodent"; }
}

class Mouse1 extends Rodent {
	public void liveHouse() { print("Mouse live in room"); }
	public String toString() { return "Mouse"; }
}

class Gerbil1 extends Rodent {
	public void liveHouse() { print("Gerbil live in soil pit"); }
	public String toString() { return "Gerbil"; }
}

class Hamster1 extends Rodent {
	public void liveHouse() { print("Hamster live in cave"); }
	public String toString() { return "Hamster"; }
}


public class Exercise1110 {
	
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
		ArrayList<Rodent> rodents = new ArrayList<Rodent>();
		rodents.add(new Mouse1());
		rodents.add(new Gerbil1());
		rodents.add(new Hamster1());
		
		Iterator<Rodent> it = rodents.iterator();
		while (it.hasNext()) {
			live(it.next());
		}
	}

}
