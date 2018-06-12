package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Instrument {
	public void play(Note n) {
		print("Instrument.play()");
	}
	public String toString() { return "Instrument"; }
	void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
	public void play(Note n){
		print("Wind.play() " + n);
	}
	public String toString() { return "Wind"; }
	void adjust() { print("Adjusting Wind"); }
}

public class Music {
	
	public static void tune(Instrument i) {
		i.play(Note.B_FLAT);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		tune(flute);
	}

}
