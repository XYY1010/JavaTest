package com.xyy.test15;

import static com.xyy.tools.Print.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise1706 {

	static void test(String msg, List<String> list) {
		System.out.println("--- " + msg + " ---");
		Collection<String> c = list;
		Collection<String> subList = list.subList(1, 8);
		// Copy of the sublist:
		Collection<String> c2 = new ArrayList<String>(subList);
		try {
			c.retainAll(c2);
		} catch (Exception e) {
			// TODO: handle exception
			print("retainAll(): " + e);
		}
		try {
			c.removeAll(c2);
		} catch (Exception e) {
			// TODO: handle exception
			print("removeAll(): " + e);
		}
		try {
			c.clear();
		} catch (Exception e) {
			// TODO: handle exception
			print("clear(): " + e);
		}
		try {
			c.add("X");
		} catch (Exception e) {
			// TODO: handle exception
			print("add(): " + e);
		}
		try {
			c.addAll(c2);
		} catch (Exception e) {
			// TODO: handle exception
			print("addAll(): " + e);
		}
		try {
			c.remove("C");
		} catch (Exception e) {
			// TODO: handle exception
			print("remove(): " + e);
		}
		// The List.set() method modifies the value but
		// doesn't change the size of the data structure:
		try {
			list.set(0, "X");
		} catch (Exception e) {
			// TODO: handle exception
			print("List.set(): " + e);
		}
		try {
			list.add(0, "X");
		} catch (Exception e) {
			// TODO: handle exception
			print("List.add(): " + e);
		}
		try {
			list.addAll(0, c2);
		} catch (Exception e) {
			// TODO: handle exception
			print("List.addAll(): " + e);
		}
		try {
			list.remove(0);
		} catch (Exception e) {
			// TODO: handle exception
			print("List.remove(): " + e);
		}
		try {
			list.removeAll(c2);
		} catch (Exception e) {
			// TODO: handle exception
			print("List.removeAll(): " + e);
		}
		try {
			list.retainAll(c2);
		} catch (Exception e) {
			// TODO: handle exception
			print("List.retainAll(): " + e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		test("Modifiable Copy", new ArrayList<String>(list));
		test("Arrays.asList()", list);
		test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));
	}

}
