package com.xyy.test7;

import static com.xyy.tools.Print.*;

import com.xyy.test6.Note;

interface Instrument2 {
	int VALUE = 5;	// static & final
	void adjust();
}

interface Playable {
	void play(Note n); // Automatically public
}

class Wind2 implements Instrument2, Playable {
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print(this + ".play() " + n);
	}
	public String toString() { return "Wind2"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Percussion2 implements Instrument2, Playable {
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print(this + ".play() " + n);
	}
	public String toString() { return "Percussion2"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Stringed2 implements Instrument2, Playable {
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print(this + ".play() " + n);
	}
	public String toString() { return "Stringed2"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Brass2 extends Wind2 {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brass2";
	}
}

class Woodwind2 extends Wind2 {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Woodwind2";
	}
}


public class Exercise910 {
	
	public static void tune(Playable p) {
		p.play(Note.B_FLAT);
	}
	
	public static void tuneAll(Playable[] ps){
		for(Playable p : ps) {
			tune(p);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable[] orchestra = {
				new Wind2(),
				new Percussion2(),
				new Stringed2(),
				new Brass2(),
				new Woodwind2()
		};
		tuneAll(orchestra);
	}

}
