package com.xyy.test15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Vector;

import com.xyy.test14.Generated;
import com.xyy.tools.CountingGenerator;

public class Exercise1729 {
	static Random rand = new Random();
	static int reps = 1000;
	static List<Test<List<String>>> tests = new ArrayList<Test<List<String>>>();
	static List<Test<LinkedList<String>>> qTests = new ArrayList<Test<LinkedList<String>>>();
	static {
		tests.add(new Test<List<String>>("add") {
			
			@Override
			int test(List<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				int listSize = tp.size;
				for (int i = 0; i < loops; i++) {
					container.clear();
					for (int j = 0; j < listSize; j++) {
						container.add("hi");
					}
				}
				return loops * listSize;
			}
		});
		tests.add(new Test<List<String>>("get") {
			
			@Override
			int test(List<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops * reps;
				int listSize = container.size();
				for (int i = 0; i < loops; i++) {
					container.get(rand.nextInt(listSize));
				}
				return loops;
			}
		});
		tests.add(new Test<List<String>>("set") {
			
			@Override
			int test(List<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops * reps;
				int listSize = container.size();
				for (int i = 0; i < loops; i++) {
					container.set(rand.nextInt(listSize), "dssd");
				}
				return loops;
			}
		});
		tests.add(new Test<List<String>>("iteradd") {
			
			@Override
			int test(List<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				final int LOOPS = 1000000;
				int half = container.size() / 2;
				ListIterator<String> it = container.listIterator(half);
				for (int i = 0; i < LOOPS; i++) {
					it.add("oow");
				}
				return LOOPS;
			}
		});
		tests.add(new Test<List<String>>("insert") {
			
			@Override
			int test(List<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				for (int i = 0; i < loops; i++) {
					container.add(5, "asdasd");		// Minimize random-access cost
				}
				return loops;
			}
		});
		tests.add(new Test<List<String>>("remove") {
			
			@Override
			int test(List<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				int size = tp.size;
				for (int i = 0; i < loops; i++) {
					container.clear();
					container.addAll(Arrays.asList(Generated.array(String.class, new CountingGenerator.String(5), size)));
					while (container.size() > 5) {
						container.remove(5);	// Minimize random-access cost
					}
				}
				return loops * size;
			}
		});
		// Tests for queue behavior:
		qTests.add(new Test<LinkedList<String>>("addFirst") {

			@Override
			int test(LinkedList<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				int size =	tp.size;
				for (int i = 0; i < loops; i++) {
					container.clear();
					for (int j = 0; j < size; j++) {
						container.addFirst("dsda");
					}
				}
				return loops * size;
			}
		});
		qTests.add(new Test<LinkedList<String>>("addLast") {
			
			@Override
			int test(LinkedList<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				int size = tp.size;
				for (int i = 0; i < loops; i++) {
					container.clear();
					for (int j = 0; j < size; j++) {
						container.addLast("dsad");
					}
				}
				return loops * size;
			}
		});
		qTests.add(new Test<LinkedList<String>>("rmFirst") {
			
			@Override
			int test(LinkedList<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				int size = tp.size;
				for (int i = 0; i < loops; i++) {
					container.clear();
					container.addAll(Arrays.asList(Generated.array(String.class, new CountingGenerator.String(5), size)));
					while (container.size() > 0) {
						container.removeFirst();
					}
				}
				return loops * size;
			}
		});
		qTests.add(new Test<LinkedList<String>>("rmLast") {
			
			@Override
			int test(LinkedList<String> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				int size = tp.size;
				for (int i = 0; i < loops; i++) {
					container.clear();
					container.addAll(Arrays.asList(Generated.array(String.class, new CountingGenerator.String(5), size)));
					while (container.size() > 0) {
						container.removeLast();
					}
				}
				return loops * size;
			}
		});
	}
	static class ListTester extends Tester<List<String>> {

		public ListTester(List<String> container, List<Test<List<String>>> tests) {
			super(container, tests);
			// TODO Auto-generated constructor stub
		}
		@Override
		protected List<String> initialize(int size) {
			container.clear();
			container.addAll(Arrays.asList(Generated.array(String.class, new CountingGenerator.String(5), size)));
			return container;
		}
		public static void run(List<String> list, List<Test<List<String>>> tests) {
			new ListTester(list, tests).timedTest();

		}
	}
	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
		if (args.length > 0) {
			Tester.defaultParams = TestParam.array(args);
		}
		// Can only do these two tests on an array:
		Tester<List<String>> arrayTest = new Tester<List<String>>(null, tests.subList(1,  3)) {
			// This will be called before each test. It
			// produces a non-resizeable array-backed list:
			@Override
			protected List<String> initialize(int size) {
				String[] sa = Generated.array(String.class, new CountingGenerator.String(), size);
				return Arrays.asList(sa);
			}
		};
		arrayTest.setHeadline("Array as List");
		arrayTest.timedTest();
		Tester.defaultParams = TestParam.array(10, 5000, 100, 5000, 1000, 1000, 10000, 200);
		if (args.length > 0) {
			Tester.defaultParams = TestParam.array(args);
		}
		ListTester.run(new ArrayList<String>(), tests);
		ListTester.run(new LinkedList<String>(), tests);
		ListTester.run(new Vector<String>(), tests);
		Tester.fieldWidth = 12;
		Tester<LinkedList<String>> qTest = new Tester<LinkedList<String>>(new LinkedList<String>(), qTests);
		qTest.setHeadline("Queue tests");
		qTest.timedTest();
	}

}
