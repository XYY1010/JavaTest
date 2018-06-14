package com.xyy.test9;

import static com.xyy.tools.Print.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercise118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		
		gerbils.add(new Gerbil(0));
		gerbils.add(new Gerbil(10));
		gerbils.add(new Gerbil(20));
		gerbils.add(new Gerbil(5));
		gerbils.add(new Gerbil(60));
		gerbils.add(new Gerbil(100));
		
		Iterator<Gerbil> it = gerbils.iterator();
		while (it.hasNext()) {
			Gerbil g = it.next();
			g.hop();
		}
	}

}
