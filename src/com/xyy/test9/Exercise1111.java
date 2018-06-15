package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Exercise1111 {

	public static void printMethod(Collection<Object> collection) {
		Iterator<Object> it = collection.iterator();
		while (it.hasNext()) {
			printnb(it.next().toString() + ", ");
		}
		print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Object> arrayList = new ArrayList<Object>();
		Collection<Object> hashSet = new HashSet<Object>();
		Collection<Object> treeSet = new TreeSet<Object>();
		Collection<Object> linkedList = new LinkedList<Object>();
		Collection<Object> linkedHashSet = new LinkedHashSet<Object>();
		arrayList.add("daas");
		arrayList.add("asgr");
		arrayList.add("jgfg");
		linkedList.add("fdsd");
		linkedList.add("svcbc");
		linkedList.add("uvixc");
		
		for (int i = 0; i < 10; i++) {
			hashSet.add(i);
		}
		
		for (int i = 0; i < 10; i++) {
			treeSet.add((double)(i * i));
		}
		
		for (int i = 0; i < 10; i++) {
			linkedHashSet.add(i * i * i);
		}
		
		printMethod(arrayList);
		printMethod(hashSet);
		printMethod(treeSet);
		printMethod(linkedList);
		printMethod(linkedHashSet);
		
	}

}
