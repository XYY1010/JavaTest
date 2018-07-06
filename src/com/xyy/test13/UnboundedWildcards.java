package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {

	static List list1;
	static List<?> list2;
	static List<? extends Object> list3;
	static void assign1(List list) {
		list1 = list;
		list2 = list;
		list3 = list;	// Warning: unchecked conversion
		// Found: List, Required: List<? extends Object>
	}
	static void assign2(List<?> list) {
		list1 = list;
		list2 = list;
		list3 = list;
	}
	static void assign3(List<?> list) {
		list1 = list;
		list2 = list;
		list3 = list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign1(new ArrayList());
		assign2(new ArrayList());
		assign3(new ArrayList()); // Warning:
		// Unchecked conversion. Found: ArrayList
		// Required: List<? extends Object>:
		assign1(new ArrayList<String>());
		assign2(new ArrayList<String>());
		assign3(new ArrayList<String>());
		// Both forms are acceptable as List<?>
		
		List<?> wildList = new ArrayList();
		wildList = new ArrayList<String>();
		assign1(wildList);
		assign2(wildList);
		assign3(wildList);
	}

}
