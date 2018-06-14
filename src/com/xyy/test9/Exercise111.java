package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;

class Gerbil {
	private int gerbilNumber;
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	public void hop() {
		print(gerbilNumber + "ºÅÉ³ÊóÕıÔÚ·´¸´ºáÌø");
	}
}

public class Exercise111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		gerbils.add(new Gerbil(0));
		gerbils.add(new Gerbil(10));
		gerbils.add(new Gerbil(20));
		gerbils.add(new Gerbil(5));
		gerbils.add(new Gerbil(60));
		gerbils.add(new Gerbil(100));
		
		for (Gerbil g : gerbils) {
			g.hop();
		}
	}

}
