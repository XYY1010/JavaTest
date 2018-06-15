package com.xyy.test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static com.xyy.tools.Print.*;

public class MultiIterableClass extends IterableClass {

	public Iterable<String> reversed() {
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {
					int current = words.length - 1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return words[current--];
					}
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	} 
	
	public Iterable<String> randomized() {
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiIterableClass mic = new MultiIterableClass();
		for(String s : mic.reversed()) {
			printnb(s + " ");
		}
		print();
		for (String s : mic.randomized()) {
			printnb(s + " ");
		}
		print();
		for (String s : mic) {
			printnb(s + " ");
		}
	}

}
