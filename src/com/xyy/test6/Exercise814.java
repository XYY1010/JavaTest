package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Peanut {
	private int refCounter = 0;
	private static long count = 0;
	private final long id = count++;
	public Peanut() {
		print("Creating " + this);
	}
	public void addRef() {
		refCounter++;
	}
	public String toString() { return "Peanut" + id; }
	public void dispose() {
		if (--refCounter == 0) {
			print("dispose " + this);
		}
	}
}

class Rodent1 {
	private Peanut peanut = new Peanut();
	private static long count = 0;
	private final long id = count++;
	public Rodent1(Peanut peanut) {
		this.peanut = peanut;
		peanut.addRef();
		print("Creating " + this); 
	}
	public String toString() { return "Rodent " + id; }
	public void dispose() {
		print("dispose" + this);
		peanut.dispose();
	}
}

public class Exercise814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peanut peanut = new Peanut();
		Rodent1[] rodent1s = new Rodent1[] {
				new Rodent1(peanut), new Rodent1(peanut), 
				new Rodent1(peanut), new Rodent1(peanut), 
				new Rodent1(peanut), new Rodent1(peanut), 
		};
		for(Rodent1 r : rodent1s) {
			r.dispose();
		}
	}

}
