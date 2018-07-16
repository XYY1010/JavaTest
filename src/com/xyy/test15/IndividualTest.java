package com.xyy.test15;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xyy.test9.MapOfList;

import typeinfo.pets.Individual;
import typeinfo.pets.Pet;

public class IndividualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Individual> pets = new TreeSet<Individual>();
		for (List<? extends Pet> lp : MapOfList.petPeople.values()) {
			for (Pet pet : lp) {
				pets.add(pet);
			}
		}
		System.out.println(pets);
	}

}
