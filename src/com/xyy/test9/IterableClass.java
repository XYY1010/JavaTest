package com.xyy.test9;

import java.util.Iterator;
import static com.xyy.tools.Print.*;

public class IterableClass implements Iterable<String> {

	protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String s : new IterableClass()) {
			printnb(s + " ");
		}
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>() {
			private int index = 0;
			public boolean hasNext() {
				return index < words.length;
			}
			public String next() { return words[index++]; }
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
}
