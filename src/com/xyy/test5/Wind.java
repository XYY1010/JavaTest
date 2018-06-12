package com.xyy.test5;

class Instrument {
	public void play() {}
	static void tune(Instrument i){
		i.play();
	}
}

public class Wind extends Instrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		Instrument.tune(flute);
	}

}
