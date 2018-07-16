package com.xyy.test15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
		Set<String> s = Collections.synchronizedSet(new HashSet<String>());
		Set<String> ss = Collections.synchronizedSet(new TreeSet<String>());
		Map<String, String> m = Collections.synchronizedMap(new HashMap<String, String>());
		Map<String, String> sm = Collections.synchronizedSortedMap(new TreeMap<String, String>());
	}

}
