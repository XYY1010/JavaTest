package com.xyy.test9;

import static com.xyy.tools.Print.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) { super(c); }
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			
			@Override
			public Iterator<T> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<T>() {
					int current = size() - 1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1;
					}

					@Override
					public T next() {
						// TODO Auto-generated method stub
						return get(current--);
					}
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
			
		};
	}
}

public class AdapterMethodIdiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
		for (String s : ral) {
			printnb(s + " ");
		}
		print();
		for (String s : ral.reversed()) {
			printnb(s + " ");
		}
	}

}
