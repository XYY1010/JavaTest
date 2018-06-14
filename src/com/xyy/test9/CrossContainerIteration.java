package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CrossContainerIteration {

	public static void display(Iterator<Pet> it) {
		while (it.hasNext()) {
			Pet p = it.next();
			printnb(p.id() + ":" + p + " ");
		}
		print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pet> pets = Pets.arrayList(8);
		LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS = new HashSet<Pet>(pets);
		TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
		display(pets.iterator());
		display(petsLL.iterator());
		display(petsHS.iterator());
		display(petsTS.iterator());
	}

}
