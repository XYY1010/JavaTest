package com.xyy.test15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetPerformance {

	static List<Test<Set<Integer>>> tests = new ArrayList<Test<Set<Integer>>>();
	static {
		tests.add(new Test<Set<Integer>>("add") {
			
			@Override
			int test(Set<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				int size = tp.size;
				for (int i = 0; i < loops; i++) {
					container.clear();
					for (int j = 0; j < size; j++) {
						container.add(j);
					}
				}
				return loops * size;
			}
		});
		tests.add(new Test<Set<Integer>>("contains") {
			
			@Override
			int test(Set<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops;
				int span = tp.size * 2;
				for (int i = 0; i < loops; i++) {
					for (int j = 0; j < span; j++) {
						container.contains(j);
					}
				}
				return loops * span;
			}
		});
		tests.add(new Test<Set<Integer>>("iterate") {
			
			@Override
			int test(Set<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				int loops = tp.loops * 10;
				for (int i = 0; i < loops; i++) {
					Iterator<Integer> it = container.iterator();
					while (it.hasNext()) {
						it.next();
					}
				}
				return loops * container.size();
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			Tester.defaultParams = TestParam.array(args);
		}
		Tester.fieldWidth = 10;
		Tester.run(new TreeSet<Integer>(), tests);
		Tester.run(new HashSet<Integer>(), tests);
		Tester.run(new LinkedHashSet<Integer>(), tests);
	}

}