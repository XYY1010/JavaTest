package com.xyy.test15;

import java.util.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import com.xyy.tools.CountingIntegerList;

class FastTraversalLinkedList<T> extends AbstractList<T> {
	private class FlaggedArrayList {
		private FlaggedLinkedList companion;
		boolean changed = false;
		private ArrayList<T> list = new ArrayList<T>();
		public void addCompanion(FlaggedLinkedList other) {
			companion = other;
		}
		private void synchronize() {
			if (companion.changed) {
				list = new ArrayList<T>(companion.list);
				companion.changed = false;
			}
		}
		public T get(int index) {
			synchronize();
			return list.get(index);
		}
		public int size() {
			synchronize();
			return list.size();
		}
		public T remove(int index) {
			synchronize();
			changed = true;
			return list.remove(index);
		}
		public boolean remove(Object item) {
			synchronize();
			changed = true;
			return list.remove(item);
		}
		// Always broadcasted to the companion container, too.
		public void clear() {
			list.clear();
			changed = false;
		}
	}
	private class FlaggedLinkedList {
		private FlaggedArrayList companion;
		boolean changed = false;
		LinkedList<T> list = new LinkedList<T>();
		public void addCompanion(FlaggedArrayList other) {
			companion = other;
		}
		private void synchronize() {
			if (companion.changed) {
				list = new LinkedList<T>(companion.list);
				companion.changed = false;
			}
		}
		public void add(int index, T item) {
			synchronize();
			changed = true;
			list.add(index, item);
		}
		public boolean add(T item) {
			synchronize();
			changed = true;
			return list.add(item);
		}
		public Iterator<T> iterator() {
			synchronize();
			return list.iterator();
		}
		// Always broadcasted to the companion container, too.
		public void clear() {
			list.clear();
			companion.changed = false;
		}
	}
	private FlaggedArrayList aList = new FlaggedArrayList();
	private FlaggedLinkedList lList = new FlaggedLinkedList();
	// Connect the two so they can synchronize:
	{
		aList.addCompanion(lList);
		lList.addCompanion(aList);
	}
	public int size() { return aList.size(); }
	public T get(int arg) { return aList.get(arg); }
	public void add(int index, T item) {
		lList.add(index, item);
	}
	// Through testing, we discovered that the ArrayList is
	// actually must faster for removals than the LinkedList:
	public T remove(int index) {
		return aList.remove(index);
	}
	public boolean remove(Object item) {
		return aList.remove(item);
	}
	public Iterator<T> iterator() {
		return lList.iterator();
	}
	public void clear() {
		aList.clear();
		lList.clear();
	}
}

public class Exercise1733 {
	static Random rand = new Random();
	static int reps = 1000;
	static List<Test<List<Integer>>> tests = new ArrayList<Test<List<Integer>>>();
	static {
		tests.add(new Test<List<Integer>>("iter") {
			
			@Override
			int test(List<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				for (int i = 0; i < tp.loops; i++) {
					Iterator<Integer> it = container.iterator();
					while (it.hasNext()) {
						it.next();		// Produce value
					}
				}
				return tp.loops;
			}
		});
		tests.add(new Test<List<Integer>>("get") {
			
			@Override
			int test(List<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops * reps;
				int listSize = container.size();
				for (int i = 0; i < loops; i++) {
					container.get(rand.nextInt(listSize));
				}
				return loops;
			}
		});
		tests.add(new Test<List<Integer>>("insert") {
			
			@Override
			int test(List<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				for (int i = 0; i < loops; i++) {
					container.add(5, 47);	// Minimize random-access cost
				}
				return loops;
			}
		});
		tests.add(new Test<List<Integer>>("remove_I") {
			
			@Override
			int test(List<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				int count = 0;
				for (int i = container.size()/2; i < container.size(); i++) {
					++count;
					container.remove(i);
				}
				return count;
			}
		});
		tests.add(new Test<List<Integer>>("remove_O") {
			
			@Override
			int test(List<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				int count = 0;
				for (int i = container.size()/2; i < container.size(); i++) {
					++count;
					container.remove(container.get(i));
				}
				return count;
			}
		});
	}
	
	static class ListTester extends Tester<List<Integer>> {
		public ListTester(List<Integer> container, List<Test<List<Integer>>> tests) {
			super(container, tests);
		}
		// Fill to the appropriate size before each test:
		@Override
		protected List<Integer> initialize(int size) {
			container.clear();
			container.addAll(new CountingIntegerList(size));
			return container;
		}
		// Convenience method
		public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
			new ListTester(list, tests).timedTest();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTester.fieldWidth = 10;
		ListTester.run(new ArrayList<Integer>(), tests);
		ListTester.run(new LinkedList<Integer>(), tests);
		ListTester.run(new FastTraversalLinkedList(), tests);
	}

}
