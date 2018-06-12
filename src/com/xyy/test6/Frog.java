package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Characteristic {
	private String s;
	Characteristic(String s) {
		this.s = s;
		print("Creating Characteristic " + s);
	}
	protected void dispose() {
		print("disposing Characteristic " + s);
	}
}

class Description {
	private String s;
	Description(String s) {
		this.s = s;
		print("Creating Description " + s);
	}
	protected void dispose() {
		print("disposing Description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description d = new Description("Basic Living Creature");
	LivingCreature() {
		// TODO Auto-generated constructor stub
		print("LivingCreature()");
	}
	protected void dispose(){
		print("LivingCreature dispose");
		d.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description d = new Description("Animal not Vegetable");
	Animal() { print("Animal()"); }
	protected void dispose() {
		print("Animal dispose");
		p.dispose();
		d.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description d = new Description("Both water and land");
	Amphibian() { print("Amphibian()"); }
	protected void dispose() {
		print("Amphibian dispose");
		p.dispose();
		d.dispose();
		super.dispose();
	}
}


public class Frog extends Amphibian {

	private Characteristic p = new Characteristic("Croaks");
	private Description d = new Description("Eats Bugs");
	public Frog() { print("Frog()"); }
	protected void dispose() {
		print("Frog dispose");
		p.dispose();
		d.dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog = new Frog();
		print("Bye!");
		frog.dispose();
	}

}
