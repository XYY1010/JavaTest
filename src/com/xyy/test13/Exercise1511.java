package com.xyy.test13;

import java.util.LinkedList;
import java.util.List;

import com.xyy.tools.New;
import static com.xyy.tools.Print.*;

class TestNew1 {
	private List<String> ls = New.list();
	public TestNew1(List<String> ls) {
		this.ls = ls;
	}
	public TestNew1(String... strs) {
		for (String string : strs) {
			ls.add(string);
		}
	}
	public String toString() {
		return ls.toString();
	}
}

class TestNew2 {
	private LinkedList<Integer> lli = New.lList();
	public TestNew2(LinkedList<Integer> lli) {
		this.lli = lli;
	}
	public TestNew2(Integer...integers) {
		for (Integer integer : integers) {
			lli.add(integer);
		}
	}
	public String toString() {
		return lli.toString();
	}
}

public class Exercise1511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNew1 tn1 = new TestNew1("The SuperHero is Hulk, I love Hulk!".split(" "));
		print(tn1);
 		TestNew2 tn2 = new TestNew2(1, 2, 3, 4, 5);
 		print(tn2);
	}

}
