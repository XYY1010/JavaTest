package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wildcards allow covariance:
		List<? extends Fruit> flist = new ArrayList<Apple>();
		// Compile Error: can't add any type of object:
		// flist.add(new Apple());
		// flist.add(new Fruit());
		// flist.add(new Object());
		flist.add(null); // Legal but uninteresting
		// We know that is returns at least Fruit:
		Fruit f = flist.get(0);
	}

}
