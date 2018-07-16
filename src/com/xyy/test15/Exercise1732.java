package com.xyy.test15;

import java.util.ArrayList;
import java.util.List;

class IntegerContainer {
	private Integer[] array;
	private int index;
	private static final int INCR = 255;
	public IntegerContainer() {
		array = new Integer[10];
	}
	public IntegerContainer(int size) {
		array = new Integer[size];
	}
	public void add(int num) {
		if (index >= array.length) {
			Integer[] tmp = new Integer[array.length + INCR];
			for (int i = 0; i < array.length; i++) {
				tmp[i] = array[i];
			}
			index = array.length;
			array = tmp;
		}
		array[index++] = num;
	}
	public int get(int i) { return array[i]; }
	public int size() { return index; }
}

public class Exercise1732 {
	static final int LOOPS = 10000;
	static List<Test<List<Integer>>> alTests = new ArrayList<Test<List<Integer>>>();
	static List<Test<IntegerContainer>> icTests = new ArrayList<Test<IntegerContainer>>();
	static {
		alTests.add(new Test<List<Integer>>("addget") {
			
			@Override
			int test(List<Integer> container, TestParam tp) {
				// TODO Auto-generated method stub
				for (int i = 0; i < LOOPS; i++) {
					container.add(i);
					container.get(i);
				}
				return LOOPS;
			}
		});
		icTests.add(new Test<IntegerContainer>("addget") {
			
			@Override
			int test(IntegerContainer container, TestParam tp) {
				// TODO Auto-generated method stub
				for (int i = 0; i < LOOPS; i++) {
					container.add(i);
					container.get(i);
				}
				return LOOPS;
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester.defaultParams = TestParam.array(LOOPS, 1);
		Tester.run(new ArrayList<Integer>(), alTests);
		Tester.run(new IntegerContainer(LOOPS), icTests);
	}

}
