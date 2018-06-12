package com.xyy.test6;

import static com.xyy.tools.Print.*;

import java.util.Random;

class RandomInstrumentGenerator{
	private Random rand = new Random(47);
	public Instrument next() {
		switch (rand.nextInt(6)) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Brass();
		case 4:
			return new Woodwind();
		case 5:
			return new Sax();
		}
	}
}

public class Music3 {

	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
	
	public static void tune(Instrument i) {
		i.play(Note.B_FLAT);
		print(i);
	}
	
	public static void tuneAll(Instrument[] e){
		for(Instrument i : e)
			tune(i);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind(),
				new Sax()
		};
		tuneAll(orchestra);
		Instrument[] orchestra1 = new Instrument[6];
		for (int i = 0; i < orchestra1.length; i++) {
			orchestra1[i] = gen.next();
		}
		for(Instrument i : orchestra1){
			tune(i);
		}
	}

}
