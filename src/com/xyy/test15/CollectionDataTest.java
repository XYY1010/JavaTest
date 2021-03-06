package com.xyy.test15;

import java.util.LinkedHashSet;
import java.util.Set;

import com.xyy.tools.CollectionData;
import com.xyy.tools.Generator;

class Government implements Generator<String> {
	String[] foundation = ("strange women lying in ponds " + 
		"distributing swords is no basis for a system of " +
		"government").split(" ");
	private int index;
	public String next() { return foundation[index++]; }
}

public class CollectionDataTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 15));
		System.out.println(set);
		// Using the convenience method:
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
		
	}

}
