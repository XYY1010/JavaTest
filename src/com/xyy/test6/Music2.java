package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Stringed extends Instrument {
	public void play(Note n) {
		// TODO Auto-generated method stub
		print("Stringed.play() " + n);
	}
	public String toString() { return "Stringed"; }
	void adjust() { print("Adjusting Stringed"); }
}

class Percussion extends Instrument{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print("Percussion.play() " + n);
	}
	public String toString() { return "Percussion"; }
	void adjust() { print("Adjusting Percussion"); }
}

class Brass extends Instrument {
	public void play(Note n) {
		// TODO Auto-generated method stub
		print("Brass.play() " + n);
	}
	public String toString() { return "Brass"; }
	void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}
	public String toString() { return "Woodwind"; }
}

class Sax extends Brass {
	public void play(Note n) {
		print("Sax.play() " + n);
	}
	public String toString() { return "Sax"; }
}

public class Music2 {

	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Stringed i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Brass i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}

}
