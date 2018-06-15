package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8); 
}


public class NonCollectionSequence extends PetSequence {

	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			
			@Override
			public Iterator<Pet> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<Pet>() {
					int current = pets.length - 1;
					@Override
					public Pet next() {
						// TODO Auto-generated method stub
						return pets[current--];
					}
					
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1;
					}
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;
			public boolean hasNext() {
				return index < pets.length;
			}
			public Pet next() { return pets[index++]; }
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public Iterable<Pet> randomized() {
		return new Iterable<Pet>() {
			
			@Override
			public Iterator<Pet> iterator() {
				// TODO Auto-generated method stub
				List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
		InterfaceVsIterator.display(nc.reversed().iterator());
		InterfaceVsIterator.display(nc.randomized().iterator());
	}

}
