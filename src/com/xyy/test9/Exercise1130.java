package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class Exercise1130 {

	private static Pet[] pets = Pets.createArray(8);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Pet> cp = new ArrayList<Pet>();
		Collections.addAll(cp, pets);
		InterfaceVsIterator.display(cp);
		InterfaceVsIterator.display(cp.iterator());
	}

}
