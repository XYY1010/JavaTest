package com.xyy.test15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.xyy.test14.Generated;
import com.xyy.tools.CountingGenerator;
import com.xyy.tools.CountingIntegerList;

public class Exercise1730 {
	static Random rand = new Random();
	static int reps = 1000;
	static List<Test<List<Integer>>> tests = new ArrayList<Test<List<Integer>>>();
	static List<Test<LinkedList<Integer>>> qTests = new ArrayList<Test<LinkedList<Integer>>>();
	static {
		tests.add(new Test<List<Integer>>("sort") {
			
			@Override
			int test(List<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				for (int i = 0; i < loops; i++) {
					Collections.sort(container);
				}
				return loops;
			}
		});
	}
	static class ListTester extends Tester<List<Integer>> {
		public ListTester(List<Integer> container, List<Test<List<Integer>>> tests) {
			super(container, tests);
		}
		// Fill to the appropriate size before each test:
		@Override protected List<Integer> initialize(int size) {
			container.clear();
			container.addAll(new CountingIntegerList(size));
			return container;
		}
		// Convenience method:
		public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
			new ListTester(list, tests).timedTest();
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			Tester.defaultParams = TestParam.array(args);
		}
		// Can only do these two tests on an array:
		Tester<List<Integer>> arrayTest = new Tester<List<Integer>>(null, tests.subList(0,  1)) {
			// This will be called before each test. It
			// produces a non-resizeable array-backed list:
			@Override
			protected List<Integer> initialize(int size) {
				Integer[] ia = Generated.array(Integer.class, new CountingGenerator.Integer(), size);
				return Arrays.asList(ia);
			}
		};
		arrayTest.setHeadline("Array as List");
		arrayTest.timedTest();
		Tester.defaultParams = TestParam.array(10, 5000, 100, 5000, 1000, 1000, 10000, 200);
		if (args.length > 0) {
			Tester.defaultParams = TestParam.array(args);
		}
		ListTester.run(new ArrayList<Integer>(), tests);
		ListTester.run(new LinkedList<Integer>(), tests);
		Tester.fieldWidth = 12;
	}

}
