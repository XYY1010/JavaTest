package com.xyy.test7;

import com.xyy.test6.Note;
import static com.xyy.tools.Print.*;

interface Instrument1 {
	int VALUE = 5;	// static & final
	void play(Note n); // Automatically public
	void adjust();
}

class Wind1 implements Instrument1 {
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print(this + ".play() " + n);
	}
	public String toString() { return "Wind1"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Percussion1 implements Instrument1 {
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print(this + ".play() " + n);
	}
	public String toString() { return "Percussion1"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Stringed1 implements Instrument1 {
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		print(this + ".play() " + n);
	}
	public String toString() { return "Stringed1"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Brass1 extends Wind1 {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brass1";
	}
}

class Woodwind1 extends Wind1 {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Woodwind1";
	}
}

public class Music5 {

	public static void tune(Instrument1 i) {
		i.play(Note.C_SHARP);
	}
	
	public static void tuneAll(Instrument1[] e) {
		for(Instrument1 i : e){
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument1[] orchestra = {
				new Wind1(),
				new Percussion1(),
				new Stringed1(),
				new Brass1(),
				new Woodwind1()
		};
		tuneAll(orchestra);
	}

}
