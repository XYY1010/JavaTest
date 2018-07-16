package com.xyy.test15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedSet;

import static com.xyy.tools.Print.*;

class SortedSetTest<T> extends LinkedList<T> {
	int compare(T t1, T t2) {
		int c = t1.hashCode() - t2.hashCode();
		return (c < 0 ? -1 : ((c == 0) ? 0 : 1));
	}
	public boolean add(T t) {
		if (!this.contains(t)) {
			Iterator<T> it = this.iterator();
			int index = 0;
			while (it.hasNext()) {
				if (compare(it.next(), t) < 1) {
					index++;
				}
			}
			add(index, t);
			return true;
		}
		return false;
	}
}

class T {}

public class Exercise1710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSetTest<T> ss = new SortedSetTest<T>();
		ss.add(new T());
		ss.add(new T());
		ss.add(new T());
		ss.add(new T());
		ss.add(new T());
		print(ss);
		SortedSetTest<Integer> ss1 = new SortedSetTest<Integer>();
		ss1.add(new Integer(1));
		ss1.add(new Integer(1));
		ss1.add(new Integer(10));
		ss1.add(new Integer(2));
		ss1.add(new Integer(33));
		print(ss1);
		SortedSetTest<String> ss2 = new SortedSetTest<String>();
		ss2.add("eight");
		ss2.add("nine");
		ss2.add("seven");
		ss2.add("one");
		ss2.add("four");
		print(ss2);
		
	}

}
