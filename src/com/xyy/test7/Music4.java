package com.xyy.test7;

import com.xyy.test6.Note;
import static com.xyy.tools.Print.*;

abstract class Instrument {
	private int i;
	public abstract void play(Note n);
	public String what() { return "Instrument"; }
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		print("Wind.play() " + n);
	}
	public String what() { return "Wind"; }
	public void adjust() {}
}

class Percussion extends Instrument {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}
	public String what() { return "Percussion"; }
	public void adjust() {}
}

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}
	public String what() { return "Stringed"; }
	public void adjust() {}
}

class Brass extends Wind {
	public void play(Note n) {
		print("Brass.play() " + n);
	}
	public void adjust() {}
}

class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}
	public String what() {return "Woodwind";}
	public void adjust() {}
}

public class Music4 {

	public static void tune(Instrument i) {
		i.play(Note.C_SHARP);
	}
	
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] orchestra = {
				new Wind(), new Percussion(),
				new Stringed(), new Brass(),
				new Woodwind()
		};
		
		tuneAll(orchestra);
	}

}
