package com.xyy.test15;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.xyy.tools.Print.*;

class SlowSet<T> extends AbstractSet<T> {
	private List<T> values = new ArrayList<T>();
	public boolean add(T item) {
		if (values.contains(item)) {
			return false;
		} else {
			return values.add(item);
		}
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return values.iterator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return values.size();
	}
	
}

public class Exercise1718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlowSet<String> sst = new SlowSet<String>();
		sst.add("a");
		sst.add("a");
		sst.add("c");
		sst.add("d");
		sst.add("b");
		print(sst);
	}

}
