package com.xyy.test13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xyy.tools.Print.*;

class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION, MOMENTUM> {}

public class LostInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long, Double> p = new Particle<Long, Double>();
		print(Arrays.toString(list.getClass().getTypeParameters()));
		print(Arrays.toString(map.getClass().getTypeParameters()));
		print(Arrays.toString(quark.getClass().getTypeParameters()));
		print(Arrays.toString(p.getClass().getTypeParameters()));
	}

}
