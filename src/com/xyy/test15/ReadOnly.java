package com.xyy.test15;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.xyy.tools.Countries;

public class ReadOnly {
	static Collection<String> data = new ArrayList<String>(Countries.names(6));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = Collections.unmodifiableCollection(new ArrayList<String>(data));
		print(c);	// Read is OK
		//! c.add("one"); // Can't change it
		
		List<String> a = Collections.unmodifiableList(new ArrayList<String>(data));
		ListIterator<String> lit = a.listIterator();
		print(lit.next());  // Read is OK
		//! lit.add("one"); 	// Can't change it
		
		Set<String> s = Collections.unmodifiableSet(new HashSet<String>(data));
		print(s);		// Read is OK
		//! s.add("one");	// Can't change it
		// For a SortedSet
		Set<String> ss = Collections.unmodifiableSortedSet(new TreeSet<String>(data));
		print(ss);		// Read is OK
		
		Map<String, String> m = Collections.unmodifiableMap(new HashMap<String, String>(Countries.capitals(6)));
		print(m); 		// Read is OK
		// m.put("Ralph","Howdy!");	// Can't change it
		
		// For a SortedMap:
		Map<String, String> sm = Collections.unmodifiableSortedMap(new TreeMap<String, String>(Countries.capitals(6)));
		print(sm);
	}

}
