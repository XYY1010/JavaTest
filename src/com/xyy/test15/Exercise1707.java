package com.xyy.test15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.xyy.tools.Countries;
import static com.xyy.tools.Print.*;

public class Exercise1707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>(Countries.names(6));
		List<String> l2 = new LinkedList<String>(Countries.names(6));
		Iterator<String> it1 = l1.iterator();
		Iterator<String> it2 = l2.iterator();
		while (it1.hasNext()) {
			printnb(it1.next() + " ");
		}
		print();
		while (it2.hasNext()) {
			printnb(it2.next() + " ");
		}
		ListIterator<String> x = l1.listIterator(l1.size());
		ListIterator<String> y = l2.listIterator(l2.size());
		int i = 0;
		while (x.hasPrevious()) {
			l1.add(x.previousIndex()+1, y.previous());
			x = l1.listIterator(l1.size() - (i+=2));
		}
		print();
		print(l1);
		
	}

}
